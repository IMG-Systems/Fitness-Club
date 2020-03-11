package com.img.fitnessclub.user.signin.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.img.fitnessclub.user.signin.Domain.UserProfileInfo;

@Service
public interface FitnessClubUserSignInService {
	
  Optional<UserProfileInfo> getUserDetails(String user_email_id);
  
  Iterable<UserProfileInfo> getAllUserDetails();
}