package com.img.fitnessclub.user.controller;

import com.img.fitnessclub.user.entity.BusinessUserLocations;
import com.img.fitnessclub.user.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class Controller {

    @Autowired
    LocationService locationService;
    
    @RequestMapping(value = "/getAllLocations", method = RequestMethod.GET)
    public List<BusinessUserLocations> getLocations() {
        return locationService.getAllLocations();
    }


    @RequestMapping(value = "/{UserEmailId}/location", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public BusinessUserLocations createLocation(@PathVariable(value = "UserEmailId") String user_email_id, @RequestBody BusinessUserLocations location) {
        return locationService.createLocation(user_email_id, location);
    }

    @RequestMapping(value = "/getLocation/{location_id}", method = RequestMethod.GET)
    public Optional<BusinessUserLocations> getLocationById(@PathVariable(value = "location_id") String location_id) {
        return locationService.getLocationById(location_id);
    }


 //   @RequestMapping(value = "/updateService/{serviceid}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  //  public BusinessUserServices updateService(@PathVariable(value = "serviceid") Integer serviceid, @RequestBody BusinessUserServices service) {
  //      return businessService.updateService(serviceid, service);
  //  }

    @RequestMapping(value = "/deleteLocation/{location_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteLocation(@PathVariable(value = "location_id") String location_id) {
        return locationService.deleteLocation(location_id);
    } 

}