package ru.javacourse.webservice;

import javax.jws.WebService;


@WebService(endpointInterface = "ru.javacourse.webservice.SayHello")
public class SayHelloService implements SayHello {

    /**��� ��������� �������, ��� ���� ����� �������� �� ���*/
    public String sayHello(String name){
        return "Hello, "  + name;
    }
}
