package com.findroute.inventory.service;

import org.springframework.http.ResponseEntity;

import com.findroute.inventory.dto.InventoryDto;
import com.findroute.inventory.dto.ResponseStructure;

public interface IInventoryService {

	InventoryDto addTravel(InventoryDto inventory);

	ResponseStructure<Boolean> validate(String travelid, int seats);
	
}
