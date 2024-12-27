package com.findroute.inventory.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Inventory {

	@Id
	private String travelingid;
	private String source;
	private String destination;
	@ElementCollection
	private List<String> stops;
	@JsonFormat(pattern = "yyyy-MM-DD")
	private LocalDate fromdate;
	@JsonFormat(pattern = "yyyy-MM-DD")
	private LocalDate todate;
	private String busid;
	private String drivername;
	private String phno;
	private Integer seats;
	private Double price;
    @JsonFormat(pattern = "HH:mm a")  // Format as "HH:mm:ss"
    private LocalTime departuretime;
    @JsonFormat(pattern = "HH:mm a")  // Format as "HH:mm:ss"
    private LocalTime arrivaltime;
	
}
