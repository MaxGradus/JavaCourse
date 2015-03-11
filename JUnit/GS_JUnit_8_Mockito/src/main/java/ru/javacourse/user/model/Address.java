package ru.javacourse.user.model;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class Address {

    private String country;
    private String city;
    private int zip;

    public Address(String country, String city, int zip) {
        this.country = country;
        this.city = city;
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                '}';
    }
}

