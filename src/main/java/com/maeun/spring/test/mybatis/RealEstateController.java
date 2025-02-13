package com.maeun.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maeun.spring.test.mybatis.domain.RealEstate;
import com.maeun.spring.test.mybatis.service.RealEstateService;

@Controller
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	
	@ResponseBody
	@RequestMapping("/mybatis/real-estate/select/1")
	public RealEstate realEstate(@RequestParam("id") int id) {
		return realEstateService.getRealEstate(id);
	}
	
	@ResponseBody
	@RequestMapping("/mybatis/real-estate/select/2")
	public List<RealEstate> lowerRent(@RequestParam("rent") int rent) {
		return realEstateService.getLowerRent(rent);
	}
	
	@ResponseBody
	@RequestMapping("/mybatis/real-estate/select/3")
	public List<RealEstate> compositeEstate(@RequestParam("area") int area, @RequestParam("price") int price) {
		return realEstateService.getComposite(area, price);
	}

}
