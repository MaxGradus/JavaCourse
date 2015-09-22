package ru.javacourse;


import ru.javacourse.dao.RegionDao;
import ru.javacourse.model.Region;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;


@Stateless
public class RegionDaoImpl implements RegionDao {

    @PersistenceContext(unitName = "testPU") /**эта аннотация значит, что EntityManager
     ссылается на ресурс persistence.xml (в этом файле пишем data-source, который создается
     на аппликейшн-сервере)*/
    private EntityManager em;


    public Region getRegion(Integer id) {
        return em.find(Region.class, id);
    }

    public List<Region> getAllRegions() {
        List<Region> allRegions = em.createNamedQuery("Region.GetAll").getResultList();
        return allRegions;
    }

    public Serializable createRegion(Region region) {
        em.persist(region);
        return region.getRegionId();
    }

    public void removeRegion(Region region) {
        region = em.merge(region);
        em.remove(region);
    }


}
