package com.img.fitnessclub.user.repository;

import com.img.fitnessclub.user.entity.UserProfileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserProfileInfo, String> {

}