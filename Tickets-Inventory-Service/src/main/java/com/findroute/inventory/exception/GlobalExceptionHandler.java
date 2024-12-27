package com.findroute.inventory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.findroute.inventory.dto.ResponseStructure;


@RestControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(InvalidTravelingIdException.class)
ResponseEntity<ResponseStructure<Boolean>> invalidTid(InvalidTravelingIdException  ex) {
	return new ResponseEntity<ResponseStructure<Boolean>>(new ResponseStructure<Boolean>(false,"Travel Id Not Found",HttpStatus.NOT_FOUND.value()),HttpStatus.NOT_FOUND);
}



@ExceptionHandler(TicketsAreFullException.class)
ResponseEntity<ResponseStructure<Boolean>> ticketsFullEx(TicketsAreFullException ex) {
	return new ResponseEntity<ResponseStructure<Boolean>>(new ResponseStructure<Boolean>(false,"Tickets Are Sold Out",HttpStatus.NOT_FOUND.value()),HttpStatus.NOT_FOUND);
}
}    

