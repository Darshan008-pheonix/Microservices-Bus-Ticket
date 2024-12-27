package com.findroute.passenger.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger {

	@Id
	private Integer passengerid;
	private String name;
	private long phno;
	private int age;
	
}
