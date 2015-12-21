package com.maxdegree;


import com.maxdegree.entity.Driver;
import com.maxdegree.factoryDAO.Factory;
import com.maxdegree.entity.Bus;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {


        Bus bus = Factory.getInstance().getBusDAO().getBusById(5L);
        Collection<Driver> drivers = Factory.getInstance().getDriverDAO().getDriversByBus(bus);
        Iterator iterator = drivers.iterator();
        while (iterator.hasNext()) {
            Driver driver = (Driver) iterator.next();
            System.out.println(driver.getName());
        }

//        Bus bus = Factory.getInstance().getBusDAO().getBusById((long) 6);
//        System.out.println(bus.getNumber());

//        Bus bus1 = new Bus();
//        bus1.setNumber("170");
//        bus1.setRoute_id(1L);

//        Factory.getInstance().getBusDAO().addBus(bus1);
//
//        Collection busses = Factory.getInstance().getBusDAO().getAllBusses();
//        Iterator iterator = busses.iterator();
//        System.out.println("=====All Buses=====");

//        while (iterator.hasNext()) {
//            Bus bus = (Bus) iterator.next();
//            Collection drivers = Factory.getInstance().getDriverDAO().getDriversByBus(bus);
//            Iterator iterator2 = drivers.iterator();
//            System.out.println("Автобус № " + bus.getNumber());
//            while (iterator2.hasNext()) {
//                Driver driver = (Driver) iterator2.next();
//                System.out.println("Имя : " + driver.getName() + "   Фамилия: " + driver.getSurname());
//
//            }
//        }
    }
}
