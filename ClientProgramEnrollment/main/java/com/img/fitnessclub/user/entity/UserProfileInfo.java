package com.img.fitnessclub.user.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
  
  @OneToMany(mappedBy = "userprofileinfo", fetch = FetchType.LAZY)
  private Set<ClientProgramEnrollments> enrollments = new HashSet<>();
  
  public String getUser_email_id() {
		return user_email_id;
	}

	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}

	public Set<ClientProgramEnrollments> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(Set<ClientProgramEnrollments> enrollments) {
		this.enrollments = enrollments;
	}
	
}	
	
	  
	  