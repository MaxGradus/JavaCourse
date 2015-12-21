package com.maxdegree.DAO;


import com.maxdegree.entity.Bus;
import com.maxdegree.entity.Driver;
import com.maxdegree.entity.Route;

import java.sql.SQLException;
import java.util.Collection;

public interface RouteDAO {
    public void addRoute(Route route) throws SQLException;
    public void updateRoute(Long route_id, Route route) throws SQLException;
    public Route getRouteById(Long route_id) throws SQLException;
    public Collection getAllRoutes() throws SQLException;
    public void deleteRoute(Route route) throws SQLException;
    public Collection getRoutesByDriver(Driver driver) throws SQLException;
    public Collection getRoutesByBus(Bus bus) throws SQLException;
}
