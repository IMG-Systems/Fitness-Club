package com.img.fitnessclub.user.controller;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.entity.UserProfileInfoResponse;
import com.img.fitnessclub.user.exception.AlreadyExistsException;
import com.img.fitnessclub.user.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Controller {
	
  @Autowired
  SignUpService signUpService;
  
  @RequestMapping(value = "/users", method = RequestMethod.POST)
  public UserProfileInfoResponse SignUpService(@Valid @RequestBody UserProfileInfo userProfileInfo) throws AlreadyExistsException {
    return signUpService.setUserDetails(userProfileInfo);
  }
}