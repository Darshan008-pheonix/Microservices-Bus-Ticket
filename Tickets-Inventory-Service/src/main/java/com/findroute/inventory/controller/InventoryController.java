package com.findroute.inventory.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findroute.inventory.dto.InventoryDto;
import com.findroute.inventory.dto.ResponseStructure;
import com.findroute.inventory.service.IInventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	IInventoryService service;
	
	
	@PostMapping("/addTravel")
	ResponseEntity<InventoryDto> addTravel(@RequestBody InventoryDto inventory){
		//System.out.println(inventory.travelingId());
		return new ResponseEntity<InventoryDto>(service.addTravel(inventory),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/validate")
	ResponseEntity<ResponseStructure<Boolean>> validate(String travelid,int seats) {
		return new ResponseEntity<ResponseStructure<Boolean>>(service.validate(travelid, seats),HttpStatus.ACCEPTED);
	}
}
