package edu.javacourse.spring.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class BeforeMethod implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before Method " + method.getName());
        for (Object arg : args) {
            System.out.println("arg = " + arg);
        }
    }

}

