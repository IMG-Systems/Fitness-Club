package com.img.fitnessclub.user.service;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.entity.UserProfileInfoResponse;
import com.img.fitnessclub.user.exception.AlreadyExistsException;
import com.img.fitnessclub.user.repository.SignUpRepository;
import com.img.fitnessclub.user.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SignUpServiceImpl implements SignUpService {
	
  @Autowired
  SignUpRepository signUpRepository;
  
  
  public UserProfileInfoResponse setUserDetails(UserProfileInfo userProfileInfo) throws AlreadyExistsException {
	  
	  boolean userExists = signUpRepository.existsById(userProfileInfo.getUser_email_id());
	  
	  if (userExists)
	    {
	      throw new AlreadyExistsException("This Email already exists"); 
	    }
	  
	    signUpRepository.save(userProfileInfo);

	    UserProfileInfoResponse userProfileInfoResponse = new UserProfileInfoResponse();
	    
	    userProfileInfoResponse.setUser_email_id(userProfileInfo.getUser_email_id());
	    userProfileInfoResponse.setFirst_name(userProfileInfo.getFirst_name());
	    userProfileInfoResponse.setLast_name(userProfileInfo.getLast_name());
	    userProfileInfoResponse.setUser_type(userProfileInfo.getUser_type());
	    userProfileInfoResponse.setAuthentication_status(userProfileInfo.getAuthentication_status());
	    userProfileInfoResponse.setBackground_check_status(userProfileInfo.getBackground_check_status());
	    userProfileInfoResponse.setBusiness_application_status(userProfileInfo.getBusiness_application_status());
	    userProfileInfoResponse.setDirect_deposit_status(userProfileInfo.getDirect_deposit_status());

	    return userProfileInfoResponse;
  }
}