package ru.javacourse.gradle;

import org.apache.commons.collections.ListUtils;
import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;

import javax.xml.transform.Templates;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Gradle!");
        List list = ListUtils.synchronizedList(new ArrayList());
        list.add(new Object());


        try {
            Template template  = Velocity.getTemplate("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
