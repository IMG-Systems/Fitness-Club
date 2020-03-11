package com.img.fitnessclub.user.signin.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.img.fitnessclub.user.signin.Domain.UserProfileInfo;
import com.img.fitnessclub.user.signin.Exception.ResourceNotFoundException;
import com.img.fitnessclub.user.signin.Repository.FitnessClubUserSignInRepository;

@Service
public class FitnessClubUserSignInServiceImpl implements FitnessClubUserSignInService {
	
  @Autowired
  private FitnessClubUserSignInRepository fitnessClubUserSignInRepository;
  
  public Optional<UserProfileInfo> getUserDetails(String user_email_id) {
	  
    if (!fitnessClubUserSignInRepository.existsById(user_email_id)) 
    {
      throw new ResourceNotFoundException("User with email " + user_email_id + " not found"); 
    }
    
    return fitnessClubUserSignInRepository.findById(user_email_id);
  }
  
  public Iterable<UserProfileInfo> getAllUserDetails() {
    Iterable<UserProfileInfo> userProfileInfo = fitnessClubUserSignInRepository.findAll();
    return userProfileInfo;
  }
}