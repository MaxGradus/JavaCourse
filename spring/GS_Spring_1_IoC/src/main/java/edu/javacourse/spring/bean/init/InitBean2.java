package edu.javacourse.spring.bean.init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitBean2 implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface init");
    }

    public void destroy() throws Exception {
        System.out.println("Interface dispose");
    }

}
