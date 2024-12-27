package com.findroute.inventory.serviceimpln;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.findroute.inventory.dto.InventoryDto;
import com.findroute.inventory.dto.ResponseStructure;
import com.findroute.inventory.entity.Inventory;
import com.findroute.inventory.exception.InvalidTravelingIdException;
import com.findroute.inventory.exception.TicketsAreFullException;
import com.findroute.inventory.repo.InventoryRepo;
import com.findroute.inventory.service.IInventoryService;


@Service
public class InventoryServiceImpln  implements IInventoryService{

	@Autowired
	InventoryRepo repo;
	
	@Override
	public InventoryDto addTravel(InventoryDto inventory) {
	    repo.save(inventory.toEntity());
		return inventory;
	}

	@Override
	public ResponseStructure<Boolean> validate(String travelid, int seats) {
		Optional<Inventory>  inv=repo.findById(travelid);
		if(inv.isPresent()) {
			if(inv.get().getSeats()>seats) {
				return new ResponseStructure<Boolean>(true,"Booking Available",HttpStatus.FOUND.value());
			}
			else {
			throw new TicketsAreFullException();
			}
		}
		else {
			throw new InvalidTravelingIdException();
		}
		
		
	}

}
