package com.findroute.bus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findroute.bus.entity.Bus;

public interface BusRepo  extends JpaRepository<Bus,String>{
	

}
