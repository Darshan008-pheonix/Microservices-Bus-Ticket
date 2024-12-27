package com.findroute.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findroute.book.dto.BookingDto;
import com.findroute.book.service.IBookingService;

@RestController
@RequestMapping("booking")
public class BookingController {

	@Autowired
	IBookingService service;
	
	@PostMapping("/bookBus")
	ResponseEntity<BookingDto> bookBus(@RequestBody BookingDto book){
		return new ResponseEntity<BookingDto>(service.bookBus(book),HttpStatus.ACCEPTED);
	}
}
