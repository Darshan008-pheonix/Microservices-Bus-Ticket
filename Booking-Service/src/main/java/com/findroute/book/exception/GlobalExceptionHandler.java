package com.findroute.book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BusOrSeatsUnavailableException.class)
	ResponseEntity  SeatsOrBusUnAvailableEx() {
		return new ResponseEntity("BusOrSeatsUnavailableException",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(feign.FeignException.NotFound.class)
	ResponseEntity FeignException$NotFoundHandler(feign.FeignException.NotFound ex) {
		return new ResponseEntity(ex.getMessage(),HttpStatus.NOT_FOUND);	
	}
	
}
