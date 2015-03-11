package ru.javacourse.user.dao;

import ru.javacourse.user.model.User;

import java.util.List;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public interface UserDao {

    public User getUserById(int id);
    public int addUser(User user);
    public List<User> getAllUsers();
    public void updateUser(User user);
    public void removeUser(int id);

}
