package com.maeun.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maeun.spring.test.mvc.domain.Seller;
import com.maeun.spring.test.mvc.service.SellerService;

@Controller
@RequestMapping("/mvc/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/create")
	public String createSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature
			, Model model) {
		sellerService.addSeller(nickname, profileImage, temperature);
		return "redirect:/mvc/seller/print";
	}
	
//	@PostMapping("/create")
//	public String createSeller(
//			@RequestParam("nickname") String nickname
//			, @RequestParam("profileImage") String profileImage
//			, @RequestParam("temperature") double temperature
//			, Model model) {
//		Seller seller = new Seller();
//		seller.setNickname(nickname);
//		seller.setProfileImage(profileImage);
//		seller.setTemperature(temperature);
//		sellerService.addSeller(seller);
//		seller = sellerService.getSeller(seller.getId());
//		model.addAttribute("seller", seller);
//		return "mvc/sellerPrint";
//	}
	
	@GetMapping("/input")
	public String inputSeller() {
		return "mvc/sellerInput";
	}
	
	@GetMapping("/print")
	public String printSeller(@RequestParam(value="id", required = false) Integer id, Model model) {
		Seller seller = sellerService.getSeller(id);
		model.addAttribute("seller", seller);
		return "mvc/sellerPrint";
	}
	
}
