package com.findroute.bus.entity;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
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
	
	@NotBlank(message = "Company Name Should Be Empty")
	private String company;
	
	
	@Max(60)
	@Positive
	private int capacity;
	
	@NotBlank(message = "Color Should Be Empty")
	private String color;
	
	@NotBlank(message = "Bus-No Should Be Empty")
	private String no;
	
	
	@Digits(integer = 10,fraction = 0,message = "Phno should be 10 digits")
	@Positive
	@Min(1000000000)
	private long phno;
	
	@NotBlank(message = "Email Should Be Empty")
	@Email(regexp = ".*@gmail[.]com",message = "Invalid Email...!!")
	private String email;
	
	@NotBlank(message = "Bus-Type Should Be Empty")
	
	private String busType;
	
	@ElementCollection
	private List<String> Amenities;
	
	
}
