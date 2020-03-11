package com.img.fitnessclub.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.img.fitnessclub.user.entity.BusinessUserApplicationDetails;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_profile_info")

public class UserProfileInfo {
	
  @Id
  @Column(name = "user_email_id")
  private String user_email_id;
  
  @Column(name = "business_application_status")
  private String business_application_status;
  
  @OneToOne(mappedBy = "userprofileinfo", fetch = FetchType.LAZY)
  private BusinessUserApplicationDetails businessUserApplicationDetails;
  
  public String getUser_email_id() {
    return user_email_id;
  }
  
  public void setUser_email_id(String user_email_id) {
    this.user_email_id = user_email_id;
  }
  
  public String getBusiness_application_status() {
    return business_application_status;
  }
  
  public void setBusiness_application_status(String business_application_status) {
    this.business_application_status = business_application_status;
  }
  
  public BusinessUserApplicationDetails getBusinessUserApplicationDetails() {
    return businessUserApplicationDetails;
  }
  
  public void setBusinessUserApplicationDetails(BusinessUserApplicationDetails businessUserApplicationDetails) {
    this.businessUserApplicationDetails = businessUserApplicationDetails;
  }
}