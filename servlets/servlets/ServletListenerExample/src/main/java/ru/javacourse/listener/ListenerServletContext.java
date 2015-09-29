package ru.javacourse.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**когда контекст проинициализируется или уничтожится
 * Контекст сервлета - некая область куда мы можем поместить некоторые данные и пользоваться ими на протяжении
 * жизненного цикла сервлета. И эти данные доступны всем клиентам нашего приложения
 * */

public class ListenerServletContext implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ListenerServletContext.contextInitialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ListenerServletContext.contextDestroyed");
    }
}
