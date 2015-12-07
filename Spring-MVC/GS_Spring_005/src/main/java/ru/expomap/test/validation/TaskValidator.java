package ru.expomap.test.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.InitBinder;
import ru.expomap.test.model.Project;
import ru.expomap.test.model.Task;

public class TaskValidator implements Validator {


    public boolean supports(Class<?> aClass) {
        return Task.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        Task task = (Task)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Task name is required");
        if (task.getProject() == null) //если у таски нет прожекта то ошибка
            errors.rejectValue("project", "", "Task project is required, choose s project");
        if (task.getUsers() == null || task.getUsers().size() < 1) // если у таски нет юзера то ошибка
            errors.rejectValue("users", "", "Task users is required, choose at least one");

    }

    


}
