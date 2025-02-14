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
	
	public int addRealEstate(RealEstate realEstate) {
		return realEstateRepository.insertRealEstate(realEstate);
	}
	
	public int addRealEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
		return realEstateRepository.insertRealEstateByMap(realtorId, address, area, type, price, rentPrice);
	}
	
	public int changeRealEstate(RealEstate realEstate) {
		
		if(!realEstate.getType().equals("월세")) {
			realEstate.setRentPrice(null);
		} else if(realEstate.getRentPrice() == null) {
			int rentPrice = realEstateRepository.selectRealEstate(realEstate.getId()).getRentPrice();
			realEstate.setRentPrice(rentPrice);
		}
		
		return realEstateRepository.updateRealEstate(realEstate);
	}
	
	public int deleteRealEstate(int id) {
		return realEstateRepository.deleteRealEstate(id);
	}
}

