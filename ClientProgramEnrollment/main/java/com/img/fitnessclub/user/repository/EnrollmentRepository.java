package com.img.fitnessclub.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.img.fitnessclub.user.entity.ClientProgramEnrollments;

@Repository
public interface EnrollmentRepository extends JpaRepository<ClientProgramEnrollments, String> {



	

}