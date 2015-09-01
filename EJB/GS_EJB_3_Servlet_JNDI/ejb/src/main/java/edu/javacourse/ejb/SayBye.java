package edu.javacourse.ejb;

import javax.ejb.Local;



@Local
public interface SayBye {

    public String sayBye();
    public void printBye();


}
