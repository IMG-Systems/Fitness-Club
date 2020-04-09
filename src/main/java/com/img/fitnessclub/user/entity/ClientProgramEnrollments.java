package com.img.fitnessclub.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Date;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client_program_enrollments")

public class ClientProgramEnrollments{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private String enrollment_id;
	
	@Column(name = "enrollment_period")
    private Integer enrollment_period;
	
	@Column(name = "enrollment_frequency")
    private String enrollment_frequency;

    @Column(name = "enrollment_start_date")
    private Date enrollment_start_date;
    
    @Column(name = "enrollment_end_date")
    private Date enrollment_end_date;
    
    @Column(name = "trainer_email_id")
    private String trainer_email_id;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_email_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserProfileInfo userprofileinfo;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private BusinessUserPrograms businessuserprograms;


	public String getEnrollment_id() {
		return enrollment_id;
	}

	public void setEnrollment_id(String enrollment_id) {
		this.enrollment_id = enrollment_id;
	}

	public Integer getEnrollment_period() {
		return enrollment_period;
	}

	public void setEnrollment_period(Integer enrollment_period) {
		this.enrollment_period = enrollment_period;
	}

	public String getEnrollment_frequency() {
		return enrollment_frequency;
	}

	public void setEnrollment_frequency(String enrollment_frequency) {
		this.enrollment_frequency = enrollment_frequency;
	}

	public Date getEnrollment_start_date() {
		return enrollment_start_date;
	}

	public void setEnrollment_start_date(Date enrollment_start_date) {
		this.enrollment_start_date = enrollment_start_date;
	}

	public Date getEnrollment_end_date() {
		return enrollment_end_date;
	}

	public void setEnrollment_end_date(Date enrollment_end_date) {
		this.enrollment_end_date = enrollment_end_date;
	}
	
	public String getTrainer_email_id() {
		return trainer_email_id;
	}

	public void setTrainer_email_id(String trainer_email_id) {
		this.trainer_email_id = trainer_email_id;
	}

	@JsonIgnore
    public UserProfileInfo getUserProfileInfo() {
        return userprofileinfo;
    }

    @JsonIgnore
    public void setUserProfileInfo(UserProfileInfo userprofileinfo) {
        this.userprofileinfo = userprofileinfo;
    }

    @JsonIgnore
	public BusinessUserPrograms getBusinessUserPrograms() {
		return businessuserprograms;
	}

    @JsonIgnore
	public void setBusinessUserPrograms(BusinessUserPrograms businessuserprograms) {
		this.businessuserprograms = businessuserprograms;
	}
    
    
    

}