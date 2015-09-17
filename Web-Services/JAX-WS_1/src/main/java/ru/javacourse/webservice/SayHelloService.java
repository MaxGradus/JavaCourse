package ru.javacourse.webservice;

import javax.jws.WebService;


@WebService(endpointInterface = "ru.javacourse.webservice.SayHello")
public class SayHelloService implements SayHello {

    /**эта аннотация говорит, что этот метод доступен из вне*/
    public String sayHello(String name){
        return "Hello, "  + name;
    }
}
