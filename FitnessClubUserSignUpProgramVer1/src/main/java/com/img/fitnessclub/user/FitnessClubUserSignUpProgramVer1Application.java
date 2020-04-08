package com.img.fitnessclub.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
        basePackageClasses = {FitnessClubUserSignUpProgramVer1Application.class, Jsr310JpaConverters.class}
)

@SpringBootApplication
public class FitnessClubUserSignUpProgramVer1Application {

	public static void main(String[] args) {
		SpringApplication.run(FitnessClubUserSignUpProgramVer1Application.class, args);
	}

}
