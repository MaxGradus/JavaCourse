package edu.javacourse.spring.bean;


public class RegionManager {

    private String name;
    private int number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void getInfo(){
        System.out.println("Name = " + name + "\n" + "Number = " + number);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void throwException(){
        throw new IllegalArgumentException();
    }

}
