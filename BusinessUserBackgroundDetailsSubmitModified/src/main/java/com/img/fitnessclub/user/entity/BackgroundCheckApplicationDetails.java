package com.img.fitnessclub.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.img.fitnessclub.user.entity.UserProfileInfo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "background_check_application_details")

public class BackgroundCheckApplicationDetails {
  
  @Id
  @Column(name = "email_id")
  private String email_id;
  
  @OneToOne
  @JoinColumn(name = "email_id")
  @MapsId
  private UserProfileInfo userprofileinfo;
  
  @Column(name = "address")
  @NotEmpty
  private String address;
  
  @Column(name = "city")
  @NotEmpty
  private String city;
  
  @Column(name = "legal_first_name")
  @NotEmpty
  private String legal_first_name;
  
  @Column(name = "legal_last_name")
  @NotEmpty
  private String legal_last_name;
  
  @Column(name = "social_security_number")
  @NotEmpty
  private String social_security_number;
  
  @Column(name = "state")
  @NotEmpty
  private String state;
  
  @Column(name = "zipcode")
  @NotNull
  private Integer zipcode;
  
  public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLegal_first_name() {
		return legal_first_name;
	}

	public void setLegal_first_name(String legal_first_name) {
		this.legal_first_name = legal_first_name;
	}

	public String getLegal_last_name() {
		return legal_last_name;
	}

	public void setLegal_last_name(String legal_last_name) {
		this.legal_last_name = legal_last_name;
	}

	public String getSocial_security_number() {
		return social_security_number;
	}

	public void setSocial_security_number(String social_security_number) {
		this.social_security_number = social_security_number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	
	@JsonIgnore
	  public UserProfileInfo getUserProfileInfo() {
	    return userprofileinfo;
	  }
	  
	@JsonIgnore
	  public void setUserProfileInfo(UserProfileInfo userprofileinfo) {
	    this.userprofileinfo = userprofileinfo;
	  }
	
}	