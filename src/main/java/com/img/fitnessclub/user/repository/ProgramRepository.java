package com.img.fitnessclub.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.img.fitnessclub.user.entity.BusinessUserPrograms;

@Repository
public interface ProgramRepository extends JpaRepository<BusinessUserPrograms, String> {



	

}