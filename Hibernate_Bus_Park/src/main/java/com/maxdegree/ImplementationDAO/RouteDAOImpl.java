package com.maxdegree.ImplementationDAO;


import com.maxdegree.DAO.RouteDAO;
import com.maxdegree.entity.Bus;
import com.maxdegree.entity.Driver;
import com.maxdegree.entity.Route;
import com.maxdegree.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RouteDAOImpl implements RouteDAO {

    @Override
    public void addRoute(Route route) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(route);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("EXC with add Rout");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateRoute(Long route_id, Route route) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(route);
            session.getTransaction().commit();

        }catch (Exception e) {
            System.out.println("EXC with update Rout");
            e.printStackTrace();
        } finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Route getRouteById(Long route_id) throws SQLException {
        Session session = null;
        Route route = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            route = (Route) session.get(Route.class, route_id);

        } catch (Exception e) {
            System.out.println("EXC with get Rout by ID");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return route;
    }

    @Override
    public Collection getAllRoutes() throws SQLException {
        Session session = null;
        List routes = new ArrayList<Route>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            routes = session.createCriteria(Route.class).list();

        } catch (Exception e) {
            System.out.println("EXC with addAll Rout");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return routes;
    }

    @Override
    public void deleteRoute(Route route) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(route);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("EXC with delete Rout");
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Collection getRoutesByDriver(Driver driver) throws SQLException {
        Session session = null;
        List routes = new ArrayList<Route>();
        try {

        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return routes;
    }

    @Override
    public Collection getRoutesByBus(Bus bus) throws SQLException {
        return null;
    }
}
