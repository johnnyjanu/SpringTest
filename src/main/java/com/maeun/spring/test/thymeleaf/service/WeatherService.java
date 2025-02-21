package com.maeun.spring.test.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.test.thymeleaf.domain.WeatherHistory;
import com.maeun.spring.test.thymeleaf.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<WeatherHistory> getWeather() {
		return weatherRepository.selectWeather();
	}
	

}
