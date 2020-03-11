package com.img.fitnessclub.user.service;

import com.img.fitnessclub.user.entity.BackgroundCheckApplicationDetails;
import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.repository.BackgroundRepository;
import com.img.fitnessclub.user.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackgroundService {
	
  @Autowired
  BackgroundRepository backgroundRepository;
  
  @Autowired
  UserRepository userRepository;
  
  public String submitBackgroundDetails(String user_email_id, BackgroundCheckApplicationDetails background) {
	  
    Optional<UserProfileInfo> byId = userRepository.findById(user_email_id);
    
    if (!byId.isPresent()) {
      throw new RuntimeException("User with email " + user_email_id + " does not exist"); 
    }
    
    UserProfileInfo userProfileInfo = byId.get();
    
    if (background.getAddress() == null || background.getAddress().isEmpty()) {
      throw new RuntimeException("Address cannot be blank"); 
    }
    
    if (background.getCity() == null || background.getCity().isEmpty()) {
      throw new RuntimeException("City cannot be blank"); 
    }
    
    if (background.getLegal_first_name() == null || background.getLegal_first_name().isEmpty()) {
      throw new RuntimeException("First Name cannot be blank"); 
    }
    
    if (background.getLegal_last_name() == null || background.getLegal_last_name().isEmpty()) {
      throw new RuntimeException("Last Name cannot be blank"); 
    }
    
    if (background.getSocial_security_number() == null || background.getSocial_security_number().isEmpty()) {
      throw new RuntimeException("Social Security Number cannot be blank"); 
    }
    
    if (background.getState() == null || background.getState().isEmpty()) {
      throw new RuntimeException("State cannot be blank"); 
    }
    
    if (background.getZipcode() == null) {
      throw new RuntimeException("Zipcode cannot be blank"); 
    }
    
    userProfileInfo.setBackground_check_status("Submitted");
    
    background.setUserProfileInfo(userProfileInfo);
    
    backgroundRepository.save(background);
    
    return "Background Application Form submitted succcessfully";
    
  }
}
