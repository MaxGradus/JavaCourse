package com.maxdegree.ImplementationDAO;


import com.maxdegree.DAO.DriverDAO;
import com.maxdegree.hibernate.HibernateUtil;
import com.maxdegree.entity.Bus;
import com.maxdegree.entity.Driver;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DriverDAOImpl implements DriverDAO {

    @Override
    public void addDriver(Driver driver) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(driver);
            session.getTransaction().commit();

        }catch (Exception e) {
            System.out.println("EXC with ADD DRIVER");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateDriver(Long drivers_id, Driver driver) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(driver);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("EXC with update");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Driver getDriverById(Long drivers_id) throws SQLException {
        Session session = null;
        Driver driver = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            driver = (Driver) session.load(Driver.class, drivers_id);
        } catch (Exception e) {
            System.out.println("EXC with getDriver");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return driver;
    }

    @Override
    public Collection getAllDrivers() throws SQLException {
        Session session = null;
        List drivers = new ArrayList<Driver>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            drivers = session.createCriteria(Driver.class).list();
        } catch (Exception e) {
            System.out.println("EXC with getALLDriver");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return drivers;
    }

    @Override
    public void deleteDriver(Driver driver) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(driver);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("EXC with deleteDriver");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Collection getDriversByBus(Bus bus) throws SQLException {
        Session session = null;
        List<Driver> drivers = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Long bus_id = bus.getId();
            Query query = session.createQuery(
                    "SELECT d "
                    + " FROM Driver d INNER JOIN d.busses bus"
                    + " WHERE bus.id = :busId "
            ).setLong("busId", bus_id);
            drivers = (List<Driver>)query.list();

//            Long busId = bus.getId();
//            SQLQuery query = session.createSQLQuery("SELECT * FROM drivers WHERE busses.bus_id = :busId");
//            drivers = (List<Driver>)query.setLong("busId", busId).list();
            session.getTransaction().commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return drivers;
    }
}
