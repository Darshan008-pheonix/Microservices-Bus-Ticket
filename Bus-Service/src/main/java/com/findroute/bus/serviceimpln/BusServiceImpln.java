package com.findroute.bus.serviceimpln;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findroute.bus.dto.BusDto;
import com.findroute.bus.repo.BusRepo;
import com.findroute.bus.service.IBusService;


@Service
public class BusServiceImpln  implements IBusService{

	@Autowired
	BusRepo busRepo;
	
	
	@Override
	public BusDto addBus(BusDto bus) {
		busRepo.save(bus.toEntity());
		return bus;
	}

}
