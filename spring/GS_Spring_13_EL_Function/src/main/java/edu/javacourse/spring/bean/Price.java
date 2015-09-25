package edu.javacourse.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component("priceBean") // вид бина
public class Price {

    private int price;

    public int getWorstPrice(){
        return 999;
    }

    public int getBestPrice(){
        return 100;
    }

}
