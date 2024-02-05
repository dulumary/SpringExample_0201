package com.marondal.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.mybatis.domain.Review;
import com.marondal.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// 전달된 id를 가진 리뷰정보를 json으로 response에 담는다.
	// request parameter 
	// /mybatis/review?id=3
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id") int id) {  // String id = request.getParameter("id")
		
		Review review = reviewService.getReview(id);
		return review;
	}

}
