package com.img.fitnessclub.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "business_user_locations")

public class BusinessUserLocations{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private String location_id;
	
	@Column(name = "location_name")
    private String location_name;
	
	@Column(name = "addressline1")
    private String addressline1;

    @Column(name = "addressline2")
    private String addressline2;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "zipcode")
    private String zipcode;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_email_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserProfileInfo userprofileinfo;


	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
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