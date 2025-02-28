package com.maeun.spring.test.ajax.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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
	
	public int addBooking(String name, int headcount, int day, LocalDate date, String phoneNumber, String state) {
		return bookingRepository.insertBooking(name, headcount, day, date, phoneNumber, state);
	}
	
	public Booking checkBooking(String name, String phoneNumber) {
		return bookingRepository.selectBookingByInform(name, phoneNumber);
	}
	
}
