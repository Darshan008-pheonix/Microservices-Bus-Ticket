package com.findroute.bus.dto;

import java.util.List;

import com.findroute.bus.entity.Bus;

public record BusDto(String busid, String company, int capacity, String color, String no, long phno, String email
		,String busType,List<String> Amenities) {

	 public Bus toEntity() {
	        return new Bus(busid, company, capacity, color, no,phno,email,busType,Amenities);
	    }

}
