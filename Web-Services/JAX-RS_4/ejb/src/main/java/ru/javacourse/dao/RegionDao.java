package ru.javacourse.dao;

import ru.javacourse.model.Region;

import javax.ejb.Local;
import java.io.Serializable;
import java.util.List;


@Local
public interface RegionDao {

    public Region getRegion(Integer id);

    public List<Region> getAllRegions();

    public Serializable createRegion(Region region);

    public void removeRegion(Region region);

}
