package com.maeun.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.test.mybatis.domain.RealEstate;
import com.maeun.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstate(int id) {
		return realEstateRepository.selectRealEstate(id);
	}
	
	public List<RealEstate> getLowerRent(int rent) {
		return realEstateRepository.selectLowerRent(rent);
	}
	
	public List<RealEstate> getComposite(int area, int price){
		return realEstateRepository.selectComposite(area, price);
	}
}
