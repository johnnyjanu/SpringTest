package com.maeun.spring.test.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/input") 
	public String wetherInput() {
		return "thymeleaf/weatherInput";
	}
	
	@PostMapping("/create")
	public String weatherCreate(
//			@DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date
//			, @RequestParam("weather") String weather
//			, @RequestParam("microDust") String microDust
//			, @RequestParam("temperatures") double temperatures
//			, @RequestParam("precipitation") double precipitation
//			, @RequestParam("windSpeed") double windSpeed
			@ModelAttribute WeatherHistory weatherHistory) {
//		WeatherHistory weatherHistory = new WeatherHistory();
//		weatherHistory.setDate(date);
//		weatherHistory.setWeather(weather);
//		weatherHistory.setMicroDust(microDust);
//		weatherHistory.setTemperatures(temperatures);
//		weatherHistory.setPrecipitation(precipitation);
//		weatherHistory.setWindSpeed(windSpeed);
		weatherService.addWeather(weatherHistory);
		return "redirect:/thymeleaf/weather/history";
	}
	
}
