package com.maeun.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02Controller {
	
	//1. json 출력 (List, Map)
	@RequestMapping("/1")
	public List<Map<String, Object>> printJson1() {
		List<Map<String, Object>> movieList = new ArrayList<>();
		Map<String, Object> movieMap1 = new HashMap<>();
		movieMap1.put("rate", 15);
		movieMap1.put("director", "봉준호");
		movieMap1.put("time", 131);
		movieMap1.put("title", "기생충");
		movieList.add(movieMap1);
		Map<String, Object> movieMap2 = new HashMap<>();
		movieMap2.put("rate", 0);
		movieMap2.put("director", "로베르토 베니니");
		movieMap2.put("time", 116);
		movieMap2.put("title", "인생은 아름다워");
		movieList.add(movieMap2);
		Map<String, Object> movieMap3 = new HashMap<>();
		movieMap3.put("rate", 12);
		movieMap3.put("director", "크리스토퍼 놀란");
		movieMap3.put("time", 147);
		movieMap3.put("title", "인셉션");
		movieList.add(movieMap3);
		Map<String, Object> movieMap4 = new HashMap<>();
		movieMap4.put("rate", 19);
		movieMap4.put("director", "윤종빈");
		movieMap4.put("time", 133);
		movieMap4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movieList.add(movieMap4);
		Map<String, Object> movieMap5 = new HashMap<>();
		movieMap5.put("rate", 15);
		movieMap5.put("director", "프란시스 로렌스");
		movieMap5.put("time", 137);
		movieMap5.put("title", "헝거게임");
		movieList.add(movieMap5);
		return movieList;
	}
	
	public void printJson2() {
		
		Review hagulu = new Review("안녕하세요, 가입인사 드립니다.", "hagulu", "안녕하세요. 가입했어요, 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		Review bada = new Review("헐 대박", "bada", "오늘 목요일이 었어... 금요일인줄");
		Review dulumary = new Review("오늘 데이트 한 이야기 해드릴게요", "dulumary", "....");
		
		
		
	}
	
	
	
}
