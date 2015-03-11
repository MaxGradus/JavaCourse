package ru.javacourse;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("3 + 2 = " + calculator.sum(3 , 2));
        System.out.println("3 - 2 = " + calculator.sub(3 , 2));


    }

}
