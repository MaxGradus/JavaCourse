package edu.javacourse.endpoint;

import edu.javacourse.webservice.RegionServiceImpl;

import javax.xml.ws.Endpoint;


public class RegionEndpoint {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/regionService", new RegionServiceImpl());
    }

}
