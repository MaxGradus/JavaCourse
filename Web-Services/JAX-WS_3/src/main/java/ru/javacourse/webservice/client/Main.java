package ru.javacourse.webservice.client;

//http://javatalks.ru/topics/24670
public class Main {

    public static void main(String[] args) {


        System.setProperty("http.proxyHost", "192.168.0.1");
        System.setProperty("http.proxyPort", "3128");

        Airport airport = new Airport();
        AirportSoap airportSoap = airport.getAirportSoap();
        String info = airportSoap.getAirportInformationByAirportCode("JFK");


        System.out.println("info = " + info);



    }

}
