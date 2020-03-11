package com.img.fitnessclub.user.controller;

import com.img.fitnessclub.user.entity.BusinessUserApplicationDetails;
import com.img.fitnessclub.user.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
  @Autowired
  ApplicationService applicationService;
  
  @RequestMapping(value = "/{UserEmailId}/application", method = RequestMethod.POST, consumes = "application/json")
  public String createApplication(@PathVariable("UserEmailId") String user_email_id, @RequestBody BusinessUserApplicationDetails application) {
    return applicationService.createApplication(user_email_id, application);
  }
}