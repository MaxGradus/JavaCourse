package com.maxdegree.DAO;


import com.maxdegree.entity.Bus;
import com.maxdegree.entity.Driver;
import com.maxdegree.entity.Route;

import java.sql.SQLException;
import java.util.Collection;

public interface BusDAO {

    public void addBus(Bus bus) throws SQLException;
    public void updateBus(Long bus_id, Bus bus) throws SQLException;
    public Bus getBusById(Long bus_id) throws SQLException;
    public Collection getAllBusses() throws SQLException;
    public void deleteBus(Bus bus) throws SQLException;
    public Collection getBussesByDriver(Driver driver) throws SQLException;
    public Collection getBussesByRoute(Route route) throws SQLException;
}
