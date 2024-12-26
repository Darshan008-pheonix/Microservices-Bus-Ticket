package com.findroute.bus.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {

	
	
	@Id
	private String busid;
	private String company;
	private String capacity;
	private String color;
	private String no;
	private long phno;
	private String email;
	private String busType;
	private List<String> Amenities;
	
	
}
