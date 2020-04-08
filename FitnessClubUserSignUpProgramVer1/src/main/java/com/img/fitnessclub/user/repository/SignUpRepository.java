package com.img.fitnessclub.user.repository;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends CrudRepository<UserProfileInfo, Object> {}
