package ru.expomap.test.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.expomap.test.model.Project;
import ru.expomap.test.model.User;

import java.util.regex.Pattern;


public class ProjectValidator implements Validator {


    public boolean supports(Class<?> aClass) {
        return Project.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Project name is required"); // метод rejectIfEmptyOrWhitespace проверя чтобы поле name не было пустое и что не состоит из пробелов
    }
}
