package com.findroute.passenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findroute.passenger.dto.PassengerDto;
import com.findroute.passenger.service.IPassengerService;

@RestController
@RequestMapping("passenger")
public class PassengerController {

	@Autowired
	IPassengerService service;

	@PostMapping("addPassenger")
	ResponseEntity<PassengerDto> addPassenger(@RequestBody PassengerDto passenger){
		return new ResponseEntity<PassengerDto>(service.addPassenger(passenger),HttpStatus.ACCEPTED);
	}


}
