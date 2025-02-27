package com.maeun.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.test.ajax.domain.Booking;
import com.maeun.spring.test.ajax.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> infoBooking() {
		return bookingRepository.selectBooking();
	}
	
	public int deleteBooking(int id) {
		return bookingRepository.deleteBooking(id);
	}

}
