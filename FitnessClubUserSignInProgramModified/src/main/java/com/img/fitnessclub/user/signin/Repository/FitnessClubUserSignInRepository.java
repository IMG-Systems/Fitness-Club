package com.img.fitnessclub.user.signin.Repository;

import com.img.fitnessclub.user.signin.Domain.UserProfileInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FitnessClubUserSignInRepository extends CrudRepository<UserProfileInfo, String> {}