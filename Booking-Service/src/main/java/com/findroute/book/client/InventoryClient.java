package com.findroute.book.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.findroute.book.dto.ResponseStructure;

@FeignClient(url = "http://localhost:8083",value = "Tickets-Inventory-Service",name = "Tickets-Inventory-Service")
public interface InventoryClient {

	@RequestMapping(method = RequestMethod.GET,value="/inventory/validate")
	ResponseEntity<ResponseStructure<Boolean>> validate(@RequestParam String travelid,@RequestParam int seats);  
}