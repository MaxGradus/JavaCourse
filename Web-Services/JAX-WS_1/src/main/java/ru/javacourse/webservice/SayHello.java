package ru.javacourse.webservice;

import javax.jws.WebService;


@WebService
public interface SayHello {

    public String sayHello(String name);

}
