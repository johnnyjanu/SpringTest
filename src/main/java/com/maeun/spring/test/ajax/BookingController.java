package com.maeun.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maeun.spring.test.ajax.domain.Booking;
import com.maeun.spring.test.ajax.service.BookingService;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/main")
	public String showMain() {
		return "ajax/bookingMain";
	}
	
	@GetMapping("/info")
	public String showInfo(Model model) {
		List<Booking> bookingList = bookingService.infoBooking();
		model.addAttribute(bookingList);
		return "ajax/bookingInfo";
	}
	
	@GetMapping("/input")
	public String inputBooking() {
		return "ajax/bookingInput";
	}
	
	
	@PostMapping("/create")
	public Map<String, Boolean> createBooking() {
		
	}
	
	@ResponseBody
	@GetMapping("/delete")
	public Map<String, Integer> deleteBooking(@RequestParam("id") int id) {
		int result = bookingService.deleteBooking(id);
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", result);
		return resultMap;
	}
	
}
