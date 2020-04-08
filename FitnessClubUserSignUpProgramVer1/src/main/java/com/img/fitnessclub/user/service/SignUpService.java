package com.img.fitnessclub.user.service;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.entity.UserProfileInfoResponse;
import com.img.fitnessclub.user.exception.AlreadyExistsException;
import org.springframework.stereotype.Service;

@Service
public interface SignUpService {
  UserProfileInfoResponse setUserDetails(UserProfileInfo userProfileInfo) throws AlreadyExistsException;
}