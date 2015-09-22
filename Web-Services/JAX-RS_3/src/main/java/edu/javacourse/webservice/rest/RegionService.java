package edu.javacourse.webservice.rest;

import model.Region;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.net.URISyntaxException;
import java.util.*;


@Path("/regions")
public class RegionService {


    //Map<String, Region> regions = new HashMap<String, Region>(); // new instance for each request
    static Map<String, Region> regions = new HashMap<String, Region>();

    @PostConstruct
    public void init() {
        regions.put("1", new Region(1, "Moscow", 10000000));
        regions.put("2", new Region(2, "SPB", 7000000));
        regions.put("3", new Region(3, "Ekaterinburg", 2000000));
    }


    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_XML) /**ФОРМАТ В КОТОРОМ БУДЕТ ОТОБРАЖАТЬСЯ МОЙ ОТВЕТ(return region) Т.Е. ОБЪЕКТ region БУДЕТ В ВИДЕ XML*/
    public Region getRegion(@PathParam("id") String id) {
        Region region = regions.get(id);
        return region != null ? region : null;
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_XML)
    public List<Region> getAll() throws URISyntaxException {
        return new ArrayList<Region>(regions.values());
    }


    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Region> queryFormParams(@FormParam("name") String name, @FormParam("population") int population) throws URISyntaxException {
        int next = regions.size() + 1;
        regions.put(String.valueOf(next), new Region(next, name, population));
        return getAll();
    }

    /**чтобы использовать данный метод нужно передать ему xml с помощью RESTClient из IntelliJ.
     * тип запроса POST, во вкладке Body пишем:
     * <region>
     *     <id>5</id>
     *     <name>San-Francisco</name>
     *     <population>9999999</population>
     * </region>
     * Во вкладке Headers добавляем Key - Content-Type, Value - application/xml */
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML) /**тип который должен принимать метод*/
    public Collection<Region> addRegion(Region region) throws URISyntaxException {
        int next = regions.size() + 1;
        regions.put(String.valueOf(next), region);
        return getAll();
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Region> removeCity(@PathParam("id") String id) throws URISyntaxException {
        regions.remove(id);
        return getAll();
    }

    /**чтобы потестить в плагине REST Client нужно прописать в Host/port - http:\\localhost:8080
     * а в Path - /rest/regions/delete/номер id
     * */

}
