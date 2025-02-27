package com.maeun.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maeun.spring.test.ajax.service.BookmarkService;

@Controller
@RequestMapping("/ajax/bookmark")
public class BookmarkController {
	
	@Autowired
	private BookmarkService bookmarkService;
	
	@ResponseBody
	@PostMapping("/create")
	public Map<String, Integer> createBookmark(
				@RequestParam("name") String name
				, @RequestParam("url") String url
			) {
		int count = bookmarkService.addBookmark(name, url);
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", count);
		return resultMap;
	}
	
	@GetMapping("/input")
	public String inputBookmark() {
		return "ajax/bookmarkInput";
	}
	
	@GetMapping("/info")
	public String infoBoomark(Model model) {
		List bookmarkList = bookmarkService.getBookmark();
		model.addAttribute("bookmarkList", bookmarkList);
		return "ajax/bookmarkInfo";
	}
	
	@ResponseBody
	@PostMapping("/duplicate")
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		Map<String, Boolean> resultMap = new HashMap<> ();
		resultMap.put("isDuplicate", bookmarkService.isDuplicateUrl(url));
		return resultMap;
	}
	
	@ResponseBody
	@GetMapping("/delete")
	public Map<String, Integer> deleteUrl(@RequestParam("id") int id) {
		int result = bookmarkService.deleteUrl(id);
		Map<String, Integer> resultMap = new HashMap<>();
		resultMap.put("result", result);
		return resultMap;
	}
	
}
