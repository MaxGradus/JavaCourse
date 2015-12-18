package ru.expomap.test.dao;

import java.io.Serializable;
import java.util.List;


public interface AbstractDao<T> { //нужно бы написать AbstractDao<T extends Serializable>

    T getById(Integer id);
    List<T> findAll();
    T create(T entyty);
    T update(T entity);
    void delete(T entity);

}
