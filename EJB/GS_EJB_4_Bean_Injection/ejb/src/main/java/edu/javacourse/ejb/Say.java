package edu.javacourse.ejb;

import javax.ejb.Local;


@Local
public interface Say {

    public String sayHello();
    public String sayBye();

}
