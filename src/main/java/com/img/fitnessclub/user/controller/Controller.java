package com.img.fitnessclub.user.controller;

import com.img.fitnessclub.user.entity.ClientProgramEnrollments;
import com.img.fitnessclub.user.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class Controller {

    @Autowired
    EnrollmentService enrollmentService;
    
    @RequestMapping(value = "/getAllEnrollments", method = RequestMethod.GET)
    public List<ClientProgramEnrollments> getEnrollments() {
        return enrollmentService.getAllEnrollments();
    }


    @RequestMapping(value = "/{UserEmailId}/{ProgramId}/enrollment", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ClientProgramEnrollments createEnrollment(@PathVariable(value = "UserEmailId") String user_email_id, @PathVariable(value = "ProgramId") String program_id, @RequestBody ClientProgramEnrollments enrollment) {
        return enrollmentService.createEnrollment(user_email_id, program_id, enrollment);
    }

    @RequestMapping(value = "/getEnrollment/{enrollment_id}", method = RequestMethod.GET)
    public Optional<ClientProgramEnrollments> getEnrollmentById(@PathVariable(value = "enrollment_id") String enrollment_id) {
        return enrollmentService.getEnrollmentById(enrollment_id);
    }


 //   @RequestMapping(value = "/updateService/{serviceid}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  //  public BusinessUserServices updateService(@PathVariable(value = "serviceid") Integer serviceid, @RequestBody BusinessUserServices service) {
  //      return businessService.updateService(serviceid, service);
  //  }

    @RequestMapping(value = "/deleteEnrollment/{location_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteEnrollment(@PathVariable(value = "enrollment_id") String enrollment_id) {
        return enrollmentService.deleteEnrollment(enrollment_id);
    } 

}