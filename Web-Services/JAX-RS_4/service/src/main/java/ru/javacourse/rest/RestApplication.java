package ru.javacourse.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Этот класс нужен обязательно для app-server'a, чтобы наши REST сервисы поехали
 */
@ApplicationPath("/rest")
public class RestApplication extends Application{

}
