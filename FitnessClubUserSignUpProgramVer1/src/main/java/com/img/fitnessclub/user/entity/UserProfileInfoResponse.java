package com.img.fitnessclub.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_profile_info")

public class UserProfileInfoResponse {
	
  @Id
  @Column(name = "user_email_id")
  @NotEmpty
  private String user_email_id;
  
  @Column(name = "first_name")
  @NotEmpty
  private String first_name;
  
  @Column(name = "last_name")
  @NotEmpty
  private String last_name;
  
  @Column(name = "user_type")
  @NotEmpty
  private String user_type;
  
  @Column(name = "authentication_status")
  @NotEmpty
  private String authentication_status;
  
  @Column(name = "business_application_status")
  private String business_application_status;
  
  @Column(name = "background_check_status")
  private String background_check_status;
  
  @Column(name = "direct_deposit_status")
  private String direct_deposit_status;
 
  
}