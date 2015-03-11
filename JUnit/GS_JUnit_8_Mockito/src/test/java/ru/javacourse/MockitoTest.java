package ru.javacourse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import ru.javacourse.user.dao.UserDao;
import ru.javacourse.user.model.Address;
import ru.javacourse.user.model.User;
import ru.javacourse.user.service.UserService;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @Mock
    UserDao userDao = mock(UserDao.class);
    UserService userService;

    @Before
    public void setUp(){
        userService = new UserService();
        userService.setUserDao(userDao);
    }

    @Test
    public void addUserTest() {

        Address address = new Address("Russia", "Saint-Petersburg", 192029);
        User user = new User(1, "Ivan Ivanov", "Ivanov@gmail.com", 25, address);

        when(userDao.addUser(user)).thenReturn(1);

        int result = userService.createNewUser(user);
        Assert.assertEquals(result, 1);

    }

    @Test
    public void getUserTest() {

        Address address = new Address("Russia", "Saint-Petersburg", 192029);
        User user = new User(1, "Ivan Ivanov", "Ivanov@gmail.com", 25, address);

        when(userDao.getUserById(1)).thenReturn(user);

        User newUser = userService.getUser(1);
        Assert.assertEquals(newUser.getAddress(), address);

    }

    @Test
    public void updateUserTest() {

        Address address = new Address("Russia", "Saint-Petersburg", 192029);
        User user = new User(1, "Ivan Ivanov", "Ivanov@gmail.com", 25, address);

        doAnswer(new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                System.out.println("Update user...");
                Object[] args = invocation.getArguments();
                System.out.println("args = " + args);
                return null;
            }
        }).when(userDao).updateUser(any(User.class));

        userService.update(user);

    }

    @Test
    public void getAllUsersTest() {

        Address address = new Address("Russia", "Saint-Petersburg", 192029);
        User user = new User(1, "Ivan Ivanov", "Ivanov@gmail.com", 25, address);
        User user2 = new User(2, "Ivan Petrov", "Ivanov@yandex.ru", 15, address);
        User user3 = new User(3, "Ivan Sidorov", "Ivanov@mail.ru", 35, address);
        List<User> list = mock(List.class);

        list.add(user);
        list.add(user2);
        list.add(user3);

        when(userDao.getAllUsers()).thenReturn(list);

        List<User> users = userService.getAllUsers();

        verify(list).add(user);
        verify(list, times(3)).add(any(User.class));

        //error
        Assert.assertEquals(3, users.size());





    }


}
