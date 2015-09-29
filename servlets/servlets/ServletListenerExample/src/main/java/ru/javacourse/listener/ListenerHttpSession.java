package ru.javacourse.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**Слушает пользовательские сессии*/

public class ListenerHttpSession implements HttpSessionListener {

//    private static int count; // можно выставить счетчик посещений.

    @Override
    public void sessionCreated(HttpSessionEvent se) { // метод вызывается когда сессия будет создана
//        count++; // каждая новая сессия будет увеличивать переменную

        System.out.println("ListenerHttpSession.sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) { // метод вызывается когда сессия будет уничтожена
        System.out.println("ListenerHttpSession.sessionDestroyed");
    }
}
