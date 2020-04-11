package com.img.fitnessclub.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.service.SignInService;

@RestController
public class Controller {
  @Autowired
  private SignInService signInService;
  
  @RequestMapping(value = "/users/{UserEmailId}", method = RequestMethod.GET)
  public Optional<UserProfileInfo> SignInService(@PathVariable("UserEmailId") String user_email_id) {
    return signInService.getUserDetails(user_email_id);
  }
  
  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public Iterable<UserProfileInfo> SignInService() {
    return signInService.getAllUserDetails();
  }
}