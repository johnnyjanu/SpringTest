package com.maeun.spring.test.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.test.mvc.domain.Realtor;
import com.maeun.spring.test.mvc.repository.RealtorRepository;

@Service
public class RealtorService {
	
	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtor(Realtor realtor) {
		return realtorRepository.insertRealtor(realtor);
	}
	
}
