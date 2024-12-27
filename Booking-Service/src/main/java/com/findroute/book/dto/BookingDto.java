package com.findroute.book.dto;

import com.findroute.book.entity.Booking;

import jakarta.validation.constraints.NotBlank;

public record BookingDto(
		@NotBlank(message="Booking-Id cant be empty")
	    String bookingId,
	    @NotBlank(message="Passenger-Id cant be empty")
	    String passengerId,
	    @NotBlank(message="Traveling-Id cant be empty")
	    String travelingId,
	    int seats
	) {
	    public Booking toEntity() {
	        return new Booking(bookingId, passengerId, travelingId,seats);
	    }
	}
