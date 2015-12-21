package com.maxdegree.factoryDAO;


import com.maxdegree.DAO.BusDAO;
import com.maxdegree.DAO.DriverDAO;
import com.maxdegree.DAO.RouteDAO;
import com.maxdegree.ImplementationDAO.BusDAOImpl;
import com.maxdegree.ImplementationDAO.DriverDAOImpl;
import com.maxdegree.ImplementationDAO.RouteDAOImpl;

public class Factory {

    private static BusDAO busDAO = null;
    private static DriverDAO driverDAO = null;
    private static RouteDAO routeDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static synchronized BusDAO getBusDAO() {
        if (busDAO == null) {
             busDAO = new BusDAOImpl();
        }
        return busDAO;
    }

    public static synchronized DriverDAO getDriverDAO() {
        if (driverDAO == null) {
            driverDAO = new DriverDAOImpl();
        }
        return driverDAO;
    }

    public static synchronized RouteDAO getRouteDAO() {
        if (routeDAO == null) {
            routeDAO = new RouteDAOImpl();
        }
        return routeDAO;
    }
}
