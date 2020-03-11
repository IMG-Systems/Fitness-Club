package com.img.fitnessclub.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import com.img.fitnessclub.user.entity.BackgroundCheckApplicationDetails;
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
  
  @Column(name = "background_check_status")
  private String background_check_status;
  
  @OneToOne(mappedBy = "userprofileinfo", fetch = FetchType.LAZY)
  private BackgroundCheckApplicationDetails backgroundCheckApplicationDetails;
  
  public String getUser_email_id() {
    return user_email_id;
  }
  
  public void setUser_email_id(String user_email_id) {
    this.user_email_id = user_email_id;
  }
  
  public String getBackground_check_status() {
    return background_check_status;
  }
  
  public void setBackground_check_status(String background_check_status) {
    this.background_check_status = background_check_status;
  }
  
  public BackgroundCheckApplicationDetails getBackgroundCheckApplicationDetails() {
    return backgroundCheckApplicationDetails;
  }
  
  public void setBackgroundCheckApplicationDetails(BackgroundCheckApplicationDetails backgroundCheckApplicationDetails) {
    this.backgroundCheckApplicationDetails = backgroundCheckApplicationDetails;
  }
}
