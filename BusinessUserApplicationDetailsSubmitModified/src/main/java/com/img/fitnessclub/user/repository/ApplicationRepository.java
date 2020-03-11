package com.img.fitnessclub.user.repository;

import com.img.fitnessclub.user.entity.BusinessUserApplicationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<BusinessUserApplicationDetails, String> {}