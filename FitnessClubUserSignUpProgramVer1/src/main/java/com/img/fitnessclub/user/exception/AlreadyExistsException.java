package com.img.fitnessclub.user.exception;

import org.springframework.expression.AccessException;

@SuppressWarnings("serial")
public class AlreadyExistsException extends AccessException {

	public AlreadyExistsException(String message) {
		super(message);
		
	}
	
}
	

