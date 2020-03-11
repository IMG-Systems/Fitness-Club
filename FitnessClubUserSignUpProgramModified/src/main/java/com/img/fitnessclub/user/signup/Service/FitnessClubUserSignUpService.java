package com.img.fitnessclub.user.signup.Service;

import com.img.fitnessclub.user.signup.Domain.UserProfileInfo;
import org.springframework.stereotype.Service;

@Service
public interface FitnessClubUserSignUpService {
  UserProfileInfo setUserDetails(UserProfileInfo userProfileInfo);
}