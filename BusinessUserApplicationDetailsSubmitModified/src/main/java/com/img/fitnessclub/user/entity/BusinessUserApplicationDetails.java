package com.img.fitnessclub.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "business_user_application_details")

public class BusinessUserApplicationDetails {
  
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
  
  @Column(name = "business_entity_type")
  @NotEmpty
  private String business_entity_type;
  
  @Column(name = "business_name")
  @NotEmpty
  private String business_name;
  
  @Column(name = "business_opened_date")
  @NotNull
  private Date business_opened_date;
  
  @Column(name = "city")
  @NotEmpty
  private String city;
  
  @Column(name = "first_name")
  @NotEmpty
  private String first_name;
  
  @Column(name = "last_name")
  @NotEmpty
  private String last_name;
  
  @Column(name = "state")
  @NotEmpty
  private String state;
  
  @Column(name = "tax_id_number")
  @NotEmpty
  private String tax_id_number;
  
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

  public String getBusiness_entity_type() {
	return business_entity_type;
  }

  public void setBusiness_entity_type(String business_entity_type) {
	this.business_entity_type = business_entity_type;
  }

  public String getBusiness_name() {
	return business_name;
  }

  public void setBusiness_name(String business_name) {
	this.business_name = business_name;
  }

  public Date getBusiness_opened_date() {
	return business_opened_date;
  }

  public void setBusiness_opened_date(Date business_opened_date) {
	this.business_opened_date = business_opened_date;
  }

  public String getCity() {
	return city;
  }

  public void setCity(String city) {
	this.city = city;
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

  public String getState() {
	return state;
  }

  public void setState(String state) {
	this.state = state;
  }

  public String getTax_id_number() {
	return tax_id_number;
  }

  public void setTax_id_number(String tax_id_number) {
	this.tax_id_number = tax_id_number;
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
  
  
  