package com.maeun.spring.test.thymeleaf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.maeun.spring.test.thymeleaf.domain.WeatherHistory;

@Mapper
public interface WeatherRepository {
	
	public List<WeatherHistory> selectWeather();

}
