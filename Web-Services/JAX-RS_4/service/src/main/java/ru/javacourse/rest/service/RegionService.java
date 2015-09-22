package ru.javacourse.rest.service;

import ru.javacourse.RegionDaoImpl;
import ru.javacourse.dao.RegionDao;
import ru.javacourse.model.Region;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.*;


/**чтобы приложение заработало на app-server'e использую следующий URL:
 * http://localhost:8080/rest/rest/regions/любой из нижеперечисленных Path (/id; /all; /add)
 * */


@Path("/regions")
public class RegionService {


    /**чтобы инжектить этот RegionDao не через контекст, а чере аннотацию (@EJB)
     * нужно сосздать в модуле service в папке webapp -> WEB-INF фаил beans.xml*/
    @EJB
    RegionDao regionDao;


    @GET
    @Path("/id/{id}")
    /**здесь нет аннотации Produces т.к. ниже есть реализация этого метода для 2-х
     * вариантов ответа: для XML и JSON
     * */
    public Response getRegion(@PathParam ("id") String id) {
        boolean isXml = false;
        //проверка на формат...дефолтный ответ в виде JSON
        if (id.endsWith(".xml")) {
            id = id.split("\\.")[0];
            isXml = true;
        }

        Region region = regionDao.getRegion(Integer.valueOf(id));
        Response.ResponseBuilder builder = Response
                .ok()
                .entity(region)
                .type(isXml ? MediaType.APPLICATION_XML_TYPE : MediaType.APPLICATION_JSON_TYPE);
        return builder.build();
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Region> getAll() throws URISyntaxException {
        return regionDao.getAllRegions();
    }


    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Region> createRegion(@FormParam("name") String name) throws URISyntaxException {
        regionDao.createRegion(new Region(name));
        return regionDao.getAllRegions();
    }

//    public Region createRegion(@FormParam("name") String name) throws URISyntaxException {
//        Serializable id = regionDao.createRegion(new Region(name));
//        return regionDao.getRegion((Integer) id);
//    }




}
