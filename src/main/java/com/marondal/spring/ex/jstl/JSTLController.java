package com.marondal.spring.ex.jstl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTLController {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "jstl/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		// 과일 이름 리스트
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("귤");
		fruitList.add("바나나");
		
		model.addAttribute("fruitList", fruitList);
		
		List<Map<String, Object>> userList = new ArrayList<>();
		
		Map<String, Object> userMap1 = new HashMap<>();
		userMap1.put("name", "김인규");
		userMap1.put("age", 29);
		userMap1.put("hobby", "독서");
		
		Map<String, Object> userMap2 = new HashMap<>();
		userMap2.put("name", "김바다");
		userMap2.put("age", 5);
		userMap2.put("hobby", "사냥하기");
		
		userList.add(userMap1);
		userList.add(userMap2);
		
		
		model.addAttribute("userList", userList);
		
		
		
		return "jstl/ex02";
	}

}
