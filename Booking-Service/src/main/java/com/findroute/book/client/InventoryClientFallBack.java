package com.findroute.book.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.findroute.book.dto.ResponseStructure;


@Component
public class InventoryClientFallBack implements InventoryClient{

	@Override
	public ResponseEntity<ResponseStructure<Boolean>> validate(String travelid, int seats) {

		ResponseStructure<Boolean> structure=new ResponseStructure<Boolean>();
		structure.setData(false);
		structure.setMsg("Inventory Service Is Down ...Please Try After Sometime...!!");
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		return new ResponseEntity<ResponseStructure<Boolean>>(structure,HttpStatus.NOT_FOUND);
	}

}
