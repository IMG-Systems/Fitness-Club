package com.img.fitnessclub.user.signup.Repository;

import com.img.fitnessclub.user.signup.Domain.UserProfileInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessClubUserSignUpRepository extends CrudRepository<UserProfileInfo, Object> {}
