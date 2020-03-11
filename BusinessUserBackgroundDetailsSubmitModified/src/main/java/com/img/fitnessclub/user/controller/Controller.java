package com.img.fitnessclub.user.controller;

import com.img.fitnessclub.user.entity.BackgroundCheckApplicationDetails;
import com.img.fitnessclub.user.service.BackgroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @Autowired
  BackgroundService backgroundService;
  
  @RequestMapping(value = "/{UserEmailId}/background", method = RequestMethod.POST, consumes = "application/json")
  public String submitBackgroundDetails(@PathVariable("UserEmailId") String user_email_id, @RequestBody BackgroundCheckApplicationDetails background) {
    return backgroundService.submitBackgroundDetails(user_email_id, background);
  }
}