package com.img.fitnessclub.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.exception.ResourceNotFoundException;
import com.img.fitnessclub.user.repository.SignInRepository;

@Service
public class SignInServiceImpl implements SignInService {
	
  @Autowired
  private SignInRepository signInRepository;
  
  public Optional<UserProfileInfo> getUserDetails(String user_email_id) {
	  
    if (!signInRepository.existsById(user_email_id)) 
    {
      throw new ResourceNotFoundException("User with email " + user_email_id + " not found"); 
    }
    
    return signInRepository.findById(user_email_id);
  }
  
  public Iterable<UserProfileInfo> getAllUserDetails() {
    Iterable<UserProfileInfo> userProfileInfo = signInRepository.findAll();
    return userProfileInfo;
  }
}