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
@RequestMapping("/mybatis/real-estate")
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	
	@ResponseBody
	@RequestMapping("/select/1")
	public RealEstate realEstate(@RequestParam("id") int id) {
		return realEstateService.getRealEstate(id);
	}
	
	@ResponseBody
	@RequestMapping("/select/2")
	public List<RealEstate> lowerRent(@RequestParam("rent") int rent) {
		return realEstateService.getLowerRent(rent);
	}
	
	@ResponseBody
	@RequestMapping("/select/3")
	public List<RealEstate> compositeEstate(@RequestParam("area") int area, @RequestParam("price") int price) {
		return realEstateService.getComposite(area, price);
	}
	
	@ResponseBody
	@RequestMapping("/create/1")
	public String createEstate() {
		//3, 푸르지용 리버 303동 1104호, 89, 매매, 100000
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		int count = realEstateService.addRealEstate(realEstate);
		return "입력 성공 : " + count;
	}
	
	@ResponseBody
	@RequestMapping("/create/2")
	public String createEstate(@RequestParam("realtorId") int realtorId) {
		int count = realEstateService.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000,  120);
		return "입력 성공 : " + count;
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String updateEstate() {
		RealEstate realEstate = new RealEstate();
		realEstate.setId(24);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		int count = realEstateService.changeRealEstate(realEstate);
		return "수정 성공 : " + count;
	}
	

}
