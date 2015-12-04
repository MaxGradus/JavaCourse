package com.gemini.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
//@RequestMapping("/hello") // ����� �������� �� ������ URL ���� �����
public class MyController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)  // ����� �������� �� ������������ �����
    public String sayHello(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello"; //���������� ��������� �� jsp ������� hello.jsp
    }

    @RequestMapping(value = "/bye" ,method = RequestMethod.GET)
    public String sayBye(ModelMap model) {
        model.addAttribute("message", "Spring 3 MVC bye-bye!");
        return "bye";
    }

}

// Supported method argument types (21.3.3):
// http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html
