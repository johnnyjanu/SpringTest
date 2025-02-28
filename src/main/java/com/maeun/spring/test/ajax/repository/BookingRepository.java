package com.maeun.spring.test.ajax.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.maeun.spring.test.ajax.domain.Booking;

@Mapper
public interface BookingRepository {
	
	public List<Booking> selectBooking();
	public int deleteBooking(@Param("id") int id);
	public int insertBooking(
				@Param("name") String name
				, @Param("headcount") int headcount
				, @Param("day") int day
				, @Param("date") LocalDate date
				, @Param("phoneNumber") String phoneNumber
				, @Param("state") String state
			);
	public Booking selectBookingByInform(
				@Param("name") String name,
				@Param("phoneNumber") String phoneNumber
			);
	
	
}
