package com.img.fitnessclub.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException() {}
  
  public ResourceNotFoundException(String message) {
    super(message);
  }
  
  public ResourceNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}