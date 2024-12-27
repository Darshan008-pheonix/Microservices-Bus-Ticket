package com.findroute.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Booking {
	
	@Id
	private String Bookingid;
	private String passengerid;
	private String travelingid;
	private int seats;
}
