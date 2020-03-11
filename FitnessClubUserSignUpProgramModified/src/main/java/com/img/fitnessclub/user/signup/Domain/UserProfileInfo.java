package com.img.fitnessclub.user.signup.Domain;

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

public class UserProfileInfo {
	
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
  private String business_application_status = "Not Submitted";
  
  @Column(name = "background_check_status")
  private String background_check_status = "Not Submitted";
  
  @Column(name = "direct_deposit_status")
  private String direct_deposit_status = "Not Submitted";

  public String getUser_email_id() {
	return user_email_id;
  }

  public void setUser_email_id(String user_email_id) {
  	this.user_email_id = user_email_id;
  }

  public String getFirst_name() {
	return first_name;
  }

  public void setFirst_name(String first_name) {
	this.first_name = first_name;
  }

  public String getLast_name() {
	return last_name;
  }

  public void setLast_name(String last_name) {
	this.last_name = last_name;
  }

  public String getUser_type() {
	return user_type;
  }

  public void setUser_type(String user_type) {
	this.user_type = user_type;
  }

  public String getAuthentication_status() {
	return authentication_status;
  }

  public void setAuthentication_status(String authentication_status) {
	this.authentication_status = authentication_status;
  }

  public String getBusiness_application_status() {
	return business_application_status;
  }

  public void setBusiness_application_status(String business_application_status) {
	this.business_application_status = business_application_status;
  }

  public String getBackground_check_status() {
	return background_check_status;
  }

  public void setBackground_check_status(String background_check_status) {
	this.background_check_status = background_check_status;
  }

  public String getDirect_deposit_status() {
	return direct_deposit_status;
  }

  public void setDirect_deposit_status(String direct_deposit_status) {
	this.direct_deposit_status = direct_deposit_status;
  }

}
  