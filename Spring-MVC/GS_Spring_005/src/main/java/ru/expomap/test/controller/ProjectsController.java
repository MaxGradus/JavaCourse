package ru.expomap.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.expomap.test.dao.AbstractDao;
import ru.expomap.test.dao.AbstractDaoImpl;
import ru.expomap.test.model.Project;
import ru.expomap.test.validation.ProjectValidator;

import java.util.List;


@Controller
public class ProjectsController {

    @Autowired // инжектит в контроллер этот объект, тоже самое если бы написали так: private AbstractDao projectDao = new AbstractDaoImpl(Project.class)
    @Qualifier(value = "projectDao") // объясняем спрингу, какой имеено абстракт дао мы хотим тут юзать
    private AbstractDao projectDao;

    @Autowired
    @Qualifier(value = "projectValidator")
    private ProjectValidator projectValidator;


    @RequestMapping("/")
    public String foo() {
        return "redirect:/projects";
    }


    @ModelAttribute("projects")
    public List<Project> getAllProjects() {
        return projectDao.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects")
    public String get(Model model) {
        model.addAttribute("project", new Project());
        return "projects";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{action}/{id}") // когда приходит запрос типа гет, с юрлом типа /projects/{какое то действие}/{еще что то}
    public String handleAction(@PathVariable Integer id, @PathVariable String action, Model model) {
        Project project = (Project) projectDao.getById(id); // создаю объект по id
        if (action.equalsIgnoreCase("edit")) { // если {какое то действие} равно эдит тогда model.addAttribute("project", project);
            model.addAttribute("project", project);
            return "projects";
        } else if (action.equalsIgnoreCase("delete")) { // если "delete" то projectDao.delete(project);
            projectDao.delete(project);
        }
        return "redirect:/projects";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@ModelAttribute("project") Project project, BindingResult result) {  // блягодаря этой аннотации, когда я на jsp странице заполняю новое имя, спринг пытается сразу эти данные привести к Project project
        projectValidator.validate(project, result);
        if (result.hasErrors())
            return "/projects";

        projectDao.update(project);
        return "redirect:/projects";

    }


}
