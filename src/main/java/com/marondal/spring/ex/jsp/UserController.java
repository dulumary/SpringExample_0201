package com.marondal.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.jsp.service.UserService;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 이름, 생년월일, 이메일을 전달 받고, 저장하는 페이지 
//	@RequestMapping(path="/jsp/user/create", method=RequestMethod.GET)
	@GetMapping("/create")
	@ResponseBody
	public String createUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email) {
		
		int count = userService.addUser(name, birthday, email);
		
		return "수행 결과 : " + count;
	}
	
	@GetMapping("/input")
	public String inputUser() {
		return "jsp/userInput";
	}
	
	
}
