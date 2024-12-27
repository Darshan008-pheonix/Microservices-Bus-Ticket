package com.findroute.passenger.serviceimpln;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findroute.passenger.dto.PassengerDto;
import com.findroute.passenger.repo.PassengerRepo;
import com.findroute.passenger.service.IPassengerService;


@Service
public class PassengerServiceImpln  implements IPassengerService{

	@Autowired
	PassengerRepo repo;
	
	@Override
	public PassengerDto addPassenger(PassengerDto passenger) {
		// TODO Auto-generated method stub
		repo.save(passenger.toEntity());
		return passenger;
	}

}
