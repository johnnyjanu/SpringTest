package com.maeun.spring.test.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maeun.spring.test.thymeleaf.domain.WeatherHistory;
import com.maeun.spring.test.thymeleaf.service.WeatherService;

@Controller
@RequestMapping("/thymeleaf/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/history")
	public String weatherHistory(Model model) {
		List<WeatherHistory> weatherList = weatherService.getWeather();
		model.addAttribute("weatherList", weatherList);
		return "thymeleaf/weatherHistory";
	}
	
}
