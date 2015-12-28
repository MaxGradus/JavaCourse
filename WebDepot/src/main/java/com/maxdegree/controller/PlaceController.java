package com.maxdegree.controller;

import com.maxdegree.entity.Placement;
import com.maxdegree.entity.User;
import com.maxdegree.service.PlaceService;
import com.maxdegree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PlaceController {

    @Autowired
    PlaceService placeService;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/places")
    public String getAllUsers(ModelMap model) {
        List<Placement> places = placeService.getAll();
        model.put("places", places);
        return "places";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/places/{id}")
    public ModelAndView getPlace(@PathVariable("id") String placeId, ModelMap model) { //�� ��� ������ � URL ����� /places/ ������� � String placeId
        model.put("place", placeService.getById(Long.parseLong(placeId)));
        return new ModelAndView("place", model);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/free_places")
    public String freePlaces(ModelMap model) {
        List<Placement> places = placeService.getAll();
        List<Placement> myPlaces = new ArrayList<Placement>();
        for (Placement placement : places) {
            if (placement.getDate()== null) {
                myPlaces.add(placement);
            }
        }
        model.put("places", myPlaces);
        return "free_places";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/my_places")
    public String getMyPlaces(User user, ModelMap model, Principal principal) {
        String login = principal.getName();
        user = userService.getByLogin(login);
        List<Placement> places = placeService.getPlaceByUser(user);
        int size = places.size();
        model.put("places", places);
        model.put("size", size);
        return "personal_acc";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/buy_place")
    public String buyPlace(@RequestParam("select")String month, ModelMap model) {

//        int m = 0;
//
//        if(month.equals("one month")) {
//            m = 1;
//        } if(month.equals("two month")) {
//            m = 2;
//        } if(month.equals("three month")) {
//            m = 3;
//        }
        model.put("month", month);
        return "buy_place";
    }

}
