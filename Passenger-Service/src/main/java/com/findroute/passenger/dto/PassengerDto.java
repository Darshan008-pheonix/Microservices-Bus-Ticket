package com.findroute.passenger.dto;

import com.findroute.passenger.entity.Passenger;

import jakarta.validation.constraints.NotBlank;

public record PassengerDto(
		@NotBlank
	    Integer passengerId,
	    @NotBlank
	    String name,
	    @NotBlank
	    long phNo,
	    @NotBlank
	    int age
	) {
	    public Passenger toEntity() {
	        return new Passenger(passengerId, name, phNo, age);
	    }
	}
