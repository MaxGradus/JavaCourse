package com.maxdegree.controller;

import com.maxdegree.entity.Placement;
import com.maxdegree.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @RequestMapping(method = RequestMethod.GET, value = "/places")
    public String getAllUsers(ModelMap model) {
        List<Placement> places = placeService.getAll();
        List<Placement> myPlaces = validPlaces(places);
        model.put("places", myPlaces);
        return "places";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/places/{id}")
    public ModelAndView getUser(@PathVariable("id") String placeId, ModelMap model) { //то что придет в URL после /places/ попадет в String placeId
        model.put("place", placeService.getById(Long.parseLong(placeId)));
        return new ModelAndView("place", model);
    }

    public static List<Placement> validPlaces(List<Placement> list) {
        List<Placement> result = new ArrayList<Placement>();
        for (Placement placement : list) {
            if (placement.getDate()== null) {
                result.add(placement);
            }
        }
        return result;
    }
}
