package com.findroute.book.serviceimpln;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findroute.book.client.InventoryClient;
import com.findroute.book.dto.BookingDto;
import com.findroute.book.exception.BusOrSeatsUnavailableException;
import com.findroute.book.repo.BookingRepo;
import com.findroute.book.service.IBookingService;

@Service
public class BookingServiceImpln implements IBookingService{

	
	@Autowired
	BookingRepo repo;
	
	@Autowired
	InventoryClient client;
	
	@Override
	public BookingDto bookBus(BookingDto book) {
		Boolean ans = client.validate(book.travelingId(),book.seats()).getBody().getData();
		repo.save(book.toEntity());
		return book;
		
	}

}
