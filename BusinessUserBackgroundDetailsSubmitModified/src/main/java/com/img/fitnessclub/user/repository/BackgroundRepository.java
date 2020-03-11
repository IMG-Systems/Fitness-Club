package com.img.fitnessclub.user.repository;

import com.img.fitnessclub.user.entity.BackgroundCheckApplicationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackgroundRepository extends JpaRepository<BackgroundCheckApplicationDetails, String> {
	
}