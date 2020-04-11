package com.img.fitnessclub.user.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.img.fitnessclub.user.entity.BusinessUserPrograms;
import com.img.fitnessclub.user.entity.ClientProgramEnrollments;
import com.img.fitnessclub.user.repository.EnrollmentRepository;
import com.img.fitnessclub.user.repository.ProgramRepository;
import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.exception.ResourceNotFoundException;
import com.img.fitnessclub.user.repository.UserRepository;

@Service
public class EnrollmentService {

	@Autowired
	EnrollmentRepository enrollmentRepository;

    @Autowired
    ProgramRepository programRepository;

    @Autowired
    UserRepository userRepository;

    public List<ClientProgramEnrollments> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }


    public Optional<ClientProgramEnrollments> getEnrollmentById(String enrollment_id) {
        if (!enrollmentRepository.existsById(enrollment_id)) {
            throw new ResourceNotFoundException("Enrollment with Id " + enrollment_id + " not found");
        }
        return enrollmentRepository.findById(enrollment_id);
    }


    public ClientProgramEnrollments createEnrollment(String user_email_id, String program_id, ClientProgramEnrollments enrollment) {
        Set<ClientProgramEnrollments> enrollments = new HashSet<>();
        UserProfileInfo user1 = new UserProfileInfo();

        Optional<UserProfileInfo> byId = userRepository.findById(user_email_id);
        if (!byId.isPresent()) {
            throw new ResourceNotFoundException("User with Email " + user_email_id + " does not exist");
        }
        UserProfileInfo userProfileInfo = byId.get();

        enrollment.setUserProfileInfo(userProfileInfo);
        
        BusinessUserPrograms program1 = new BusinessUserPrograms();
        
        Optional<BusinessUserPrograms> pgId = programRepository.findById(program_id);
        if (!pgId.isPresent()) {
            throw new ResourceNotFoundException("Program with Id " + program_id + " does not exist");
        }
        BusinessUserPrograms businessUserPrograms = pgId.get();

        enrollment.setBusinessUserPrograms(businessUserPrograms);

        ClientProgramEnrollments enrollment1 = enrollmentRepository.save(enrollment);
     
        enrollments.add(enrollment1);
        user1.setEnrollments(enrollments);
        program1.setEnrollments(enrollments);

        return enrollment1;

    }
    
    //   public BusinessUserServices updateService(Integer serviceid, BusinessUserServices  addRequest) {
    //     if (!serviceRepository.existsById(serviceid)) {
    //         throw new ResourceNotFoundException("Service with Id" + serviceid + " not found");
   //      }
         
  //       Optional<BusinessUserServices> businessUserServices = serviceRepository.findById(serviceid);

   //      if (!businessUserServices.isPresent()) {
   //          throw new ResourceNotFoundException("Service with Id" + serviceid + " not found");
   //      }

   //      BusinessUserServices service1 = businessUserServices.get();
    //     service1.setServicename(addRequest.getServicename());
   //      service1.setStartdate(addRequest.getStartdate());
   //      service1.setEnddate(addRequest.getEnddate());
         
   //      return serviceRepository.save(service1);
//     }

     public ResponseEntity<Object> deleteEnrollment(String enrollment_id) {
         if (!enrollmentRepository.existsById(enrollment_id)) {
             throw new ResourceNotFoundException("Enrollment with Id" + enrollment_id + " not found");
         }

         enrollmentRepository.deleteById(enrollment_id);

         return ResponseEntity.ok().build();

     }
     
 }
