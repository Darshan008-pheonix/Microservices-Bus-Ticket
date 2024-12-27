package com.findroute.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findroute.book.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, String> {

}
