package com.findroute.passenger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findroute.passenger.entity.Passenger;


public interface PassengerRepo extends JpaRepository<Passenger, Integer>{

}
