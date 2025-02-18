package com.maeun.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.test.mvc.domain.Seller;
import com.maeun.spring.test.mvc.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(
			String nickname
			, String profileImage
			, double temperature) {
		return sellerRepository.insertSeller(nickname, profileImage, temperature);
		
	}
	
//	public int addSeller(Seller seller) {
//		int count = sellerRepository.insertSellerObject(seller);
//		return count;
//	}
	
	public Seller getSeller() {
		return sellerRepository.selectLastSeller();
	}
	
	public Seller getSeller(Integer id) {
		if(id == null) {
			return sellerRepository.selectLastSeller();
		} else {
			return sellerRepository.selectSeller(id);
		}
	}
	
}
