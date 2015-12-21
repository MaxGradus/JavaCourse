package com.maxdegree.DAO;


import com.maxdegree.entity.Bus;
import com.maxdegree.entity.Driver;

import java.sql.SQLException;
import java.util.Collection;

public interface DriverDAO {
    public void addDriver(Driver driver) throws SQLException;
    public void updateDriver(Long drivers_id, Driver driver) throws SQLException;
    public Driver getDriverById(Long drivers_id) throws SQLException;
    public Collection getAllDrivers() throws SQLException;
    public void deleteDriver(Driver driver) throws SQLException;
    public Collection getDriversByBus(Bus bus) throws SQLException;
}
