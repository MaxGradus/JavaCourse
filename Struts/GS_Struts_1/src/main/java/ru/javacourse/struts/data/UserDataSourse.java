package ru.javacourse.struts.data;

import ru.javacourse.struts.form.UserForm;

import java.util.ArrayList;
import java.util.List;


public class UserDataSourse {

    private static List<UserForm> users = null;


    static {
        users = new ArrayList<UserForm>();
        users.add(new UserForm(1, "Ivan", "ivan@yandex.ru", 20));
        users.add(new UserForm(2, "Vova", "vovan@mail.ru", 30));
        users.add(new UserForm(3, "Sergey", "sergo@pochta.ru", 25));
    }

    public static void add(UserForm form) throws Exception{
        if (form.getId() < 1)
            throw new Exception("errors.negative.id");
        if (getById(form.getId()) != null) {
            throw new Exception("errors.exist.id");
        }
        users.add(form);
    }

    public static UserForm getById(int id){
        for (UserForm user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public static List<UserForm> getUsers() {
        return users;
    }
}
