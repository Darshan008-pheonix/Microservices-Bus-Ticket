package com.findroute.bus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	ResponseEntity ValidationExceptionHandlers(ConstraintViolationException ex) {
		return new ResponseEntity(ex.getMessage(),HttpStatus.NOT_ACCEPTABLE);
	}
}
