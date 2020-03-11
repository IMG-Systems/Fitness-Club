package com.img.fitnessclub.user.signin.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.img.fitnessclub.user.signin.Domain.UserProfileInfo;
import com.img.fitnessclub.user.signin.Service.FitnessClubUserSignInService;

@RestController
public class FitnessClubUserSignInController {
  @Autowired
  private FitnessClubUserSignInService fitnessClubUserSignInService;
  
  @RequestMapping(value = "/getUserDetails/{UserEmailId}", method = RequestMethod.GET)
  public Optional<UserProfileInfo> FitnessClubUserSignInService(@PathVariable("UserEmailId") String user_email_id) {
    return fitnessClubUserSignInService.getUserDetails(user_email_id);
  }
  
  @RequestMapping(value = "/getAllUserDetails", method = RequestMethod.GET)
  public Iterable<UserProfileInfo> FitnessClubUserSignInService() {
    return fitnessClubUserSignInService.getAllUserDetails();
  }
}