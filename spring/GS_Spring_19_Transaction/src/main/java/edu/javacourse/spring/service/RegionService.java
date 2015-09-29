package edu.javacourse.spring.service;

import edu.javacourse.spring.model.Region;


public interface RegionService {

    public Region createRegion(Region region);
    public void deleteRegion(Region region);
    public Region getRegionByName(String name);
    public void readOnly(String name);
}
