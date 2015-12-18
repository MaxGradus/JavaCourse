package com.maxdegree.dao;


import com.maxdegree.entity.Placement;

import java.util.List;

public interface PlaceDao {

    void create(Placement place);
    void update(Placement place);
    Placement getById(Long placeId);
    List<Placement> getAll();
    Placement getByName(String name);
}
