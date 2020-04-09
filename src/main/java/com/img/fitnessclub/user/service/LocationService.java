package com.img.fitnessclub.user.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.img.fitnessclub.user.entity.BusinessUserLocations;
import com.img.fitnessclub.user.repository.LocationRepository;
import com.img.fitnessclub.user.entity.UserProfileInfo;
import com.img.fitnessclub.user.exception.ResourceNotFoundException;
import com.img.fitnessclub.user.repository.UserRepository;

@Service
public class LocationService {



    @Autowired
    LocationRepository locationRepository;

    @Autowired
    UserRepository userRepository;

    public List<BusinessUserLocations> getAllLocations() {
        return locationRepository.findAll();
    }


    public Optional<BusinessUserLocations> getLocationById(String location_id) {
        if (!locationRepository.existsById(location_id)) {
            throw new ResourceNotFoundException("Location with Id " + location_id + " not found");
        }
        return locationRepository.findById(location_id);
    }


    public BusinessUserLocations createLocation(String user_email_id, BusinessUserLocations location) {
        Set<BusinessUserLocations> locations = new HashSet<>();
        UserProfileInfo user1 = new UserProfileInfo();

        Optional<UserProfileInfo> byId = userRepository.findById(user_email_id);
        if (!byId.isPresent()) {
            throw new ResourceNotFoundException("User with Email " + user_email_id + " does not exist");
        }
        UserProfileInfo userProfileInfo = byId.get();

        location.setUserProfileInfo(userProfileInfo);

        BusinessUserLocations location1 = locationRepository.save(location);
     
        locations.add(location1);
        user1.setLocations(locations);

        return location1;

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

     public ResponseEntity<Object> deleteLocation(String location_id) {
         if (!locationRepository.existsById(location_id)) {
             throw new ResourceNotFoundException("Location with Id" + location_id + " not found");
         }

         locationRepository.deleteById(location_id);

         return ResponseEntity.ok().build();

     }
     
 }
