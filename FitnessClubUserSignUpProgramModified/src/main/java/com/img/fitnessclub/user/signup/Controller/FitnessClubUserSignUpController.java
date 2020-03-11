package com.img.fitnessclub.user.signup.Controller;

import com.img.fitnessclub.user.signup.Domain.UserProfileInfo;
import com.img.fitnessclub.user.signup.Service.FitnessClubUserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessClubUserSignUpController {
	
  @Autowired
  FitnessClubUserSignUpService fitnessClubUserSignUpService;
  
  @RequestMapping(value = "/setUserDetails", method = RequestMethod.POST)
  public UserProfileInfo FitnessClubUserSignUpService(@RequestBody UserProfileInfo userProfileInfo) {
    return fitnessClubUserSignUpService.setUserDetails(userProfileInfo);
  }
}