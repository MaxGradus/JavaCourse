package edu.javacourse.spring;


import java.io.*;

import edu.javacourse.spring.dao.RegionDao;
import edu.javacourse.spring.model.Region;
import edu.javacourse.spring.validation.RegionValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class SpringExample {

    public static void main(String[] args) {
        SpringExample se = new SpringExample();
        try {
            se.demoSpring();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void demoSpring() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springExample.xml"});

        RegionDao dao = (RegionDao) context.getBean("regionDao");


        Region region1 = new Region();
        region1.setRegionId(1);
        region1.setRegionName("SPB");
        region1.setPopulation(10000000);

        dao.createRegion(region1);
        System.out.println("=============================" + "\n");


        Region region2 = new Region();
        region2.setRegionId(1);
        region2.setRegionName("Moscow");
        region2.setPopulation(-1);

        dao.createRegion(region2);
        System.out.println("=============================" + "\n");


    }
}
