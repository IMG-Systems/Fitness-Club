package com.img.fitnessclub.user.service;

import com.img.fitnessclub.user.entity.BusinessUserApplicationDetails;
import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.repository.ApplicationRepository;
import com.img.fitnessclub.user.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
	
  @Autowired
  ApplicationRepository applicationRepository;
  
  @Autowired
  UserRepository userRepository;
  
  public String createApplication(String user_email_id, BusinessUserApplicationDetails application) {
	  
    Optional<UserProfileInfo> byId = userRepository.findById(user_email_id);
    
    if (!byId.isPresent()) {
      throw new RuntimeException("User with email " + user_email_id + " does not exist"); 
    }
    
    UserProfileInfo userProfileInfo = byId.get();
    
    if (application.getAddress() == null || application.getAddress().isEmpty()) {
      throw new RuntimeException("Address cannot be blank"); 
    }
    
    if (application.getBusiness_entity_type() == null || application.getBusiness_entity_type().isEmpty()) {
      throw new RuntimeException("Business Entity Type cannot be blank"); 
    }
    
    if (application.getBusiness_name() == null || application.getBusiness_name().isEmpty()) {
      throw new RuntimeException("Business Name cannot be blank");
    }
    
    if (application.getBusiness_opened_date() == null) {
      throw new RuntimeException("Business Opened Date cannot be blank"); 
    }
    
    if (application.getCity() == null || application.getCity().isEmpty()) {
      throw new RuntimeException("City cannot be blank"); 
    }
    
    if (application.getFirst_name() == null || application.getFirst_name().isEmpty()) {
      throw new RuntimeException("First Name cannot be blank"); 
    }
    
    if (application.getLast_name() == null || application.getLast_name().isEmpty()) {
      throw new RuntimeException("Last Name cannot be blank"); 
    }
    
    if (application.getState() == null || application.getState().isEmpty()) {
      throw new RuntimeException("State cannot be blank"); 
    }
    
    if (application.getTax_id_number() == null || application.getTax_id_number().isEmpty()) {
      throw new RuntimeException("Tax Id Number cannot be blank"); 
    }
    
    if (application.getZipcode() == null) {
      throw new RuntimeException("Zipcode cannot be blank"); 
    }
    
    userProfileInfo.setBusiness_application_status("Submitted");
    
    application.setUserProfileInfo(userProfileInfo);
    
    applicationRepository.save(application);
    
    return "Business Application Form submitted succcessfully";
    
  }
}
