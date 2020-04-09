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
@Table(name = "business_user_programs")

public class BusinessUserPrograms{
	
	@Id
    @Column(name = "program_id")
    private String program_id;
  
  @OneToMany(mappedBy = "businessuserprograms", fetch = FetchType.LAZY)
  private Set<ClientProgramEnrollments> enrollments = new HashSet<>();
  
  public String getProgram_id() {
		return program_id;
	}

	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}

	public Set<ClientProgramEnrollments> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(Set<ClientProgramEnrollments> enrollments) {
		this.enrollments = enrollments;
	}
	
}	
	
	  
	  