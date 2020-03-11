package com.img.fitnessclub.user.signup.Service;

import com.img.fitnessclub.user.signup.Domain.UserProfileInfo;
import com.img.fitnessclub.user.signup.Repository.FitnessClubUserSignUpRepository;
import com.img.fitnessclub.user.signup.Service.FitnessClubUserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FitnessClubUserSignUpServiceImpl implements FitnessClubUserSignUpService {
	
  @Autowired
  FitnessClubUserSignUpRepository fitnessClubUserSignUpRepository;
  
  
  public UserProfileInfo setUserDetails(UserProfileInfo userProfileInfo) {
	  
    if (userProfileInfo.getUser_email_id() == null || userProfileInfo.getUser_email_id().isEmpty()) 
    {
      throw new RuntimeException("Email Id cannot be blank"); 
    }
    
    if (userProfileInfo.getFirst_name() == null || userProfileInfo.getFirst_name().isEmpty()) {
      throw new RuntimeException("First Name cannot be blank"); 
    }
    
    if (userProfileInfo.getLast_name() == null || userProfileInfo.getLast_name().isEmpty()) 
    {
      throw new RuntimeException("Last Name cannot be blank"); 
    }
    
    if (userProfileInfo.getUser_type() == null || userProfileInfo.getUser_type().isEmpty()) 
    {
      throw new RuntimeException("User Type cannot be blank"); 
    }
    
    if (userProfileInfo.getAuthentication_status() == null || userProfileInfo.getAuthentication_status().isEmpty()) 
    {
      throw new RuntimeException("Authentication Status cannot be blank"); 
    }
    
    boolean userExists = fitnessClubUserSignUpRepository.existsById(userProfileInfo.getUser_email_id());
    
    if (userExists)
    {
      throw new RuntimeException("This Email already exists"); 
    }
    
     fitnessClubUserSignUpRepository.save(userProfileInfo);
     
     return userProfileInfo;
  }
  
}