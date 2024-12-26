package com.findroute.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findroute.bus.dto.BusDto;
import com.findroute.bus.service.IBusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	IBusService service;

	
	@PostMapping("/addBus")
	ResponseEntity<BusDto> addBus(@RequestBody BusDto bus){
		return  new ResponseEntity<BusDto>(service.addBus(bus),HttpStatus.ACCEPTED);
	}

}
