package com.img.fitnessclub.user.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.img.fitnessclub.user.entity.UserProfileInfo;

@Service
public interface SignInService {
	
  Optional<UserProfileInfo> getUserDetails(String user_email_id);
  
  Iterable<UserProfileInfo> getAllUserDetails();
}