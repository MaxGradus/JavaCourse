package edu.javacourse.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


@Aspect
public class AfterAspect  {

    @After("execution(* edu.javacourse.spring.bean.RegionManager.createRegion(..))")
    public void logAfter(JoinPoint joinPoint) {

        System.out.println("logAfter() is running!");
        System.out.println("перехват : " + joinPoint.getSignature().getName());
        System.out.println("******");

    }

}

