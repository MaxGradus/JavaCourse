package ru.javacourse.user.service;

import ru.javacourse.user.dao.UserDao;
import ru.javacourse.user.model.Address;
import ru.javacourse.user.model.User;

import java.util.List;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
/*
* Business logic class
* */
public class UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int createNewUser(User user) {
        if (notNullNotEmpty(user.getName()) && notNullNotEmpty(user.getEmail())) {
            int id = userDao.addUser(user);
            System.out.println("id = " + id);
            sendEmail(user.getEmail());
            sendLetter(user.getAddress());
            return id;
        }
        return  -1;
    }

    public User getUser(int id) {
        return userDao.getUserById(id);
    }

    public void update(User user) {
         userDao.updateUser(user);
    }


    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    private boolean notNullNotEmpty(String s) {
        return s != null && !s.isEmpty();
    }

    private void sendEmail(String email) {
        System.out.println("Sending email to : " + email);
    }

    private void sendLetter(Address address) {
        System.out.println("Sending letter to : " + address);
    }


}
