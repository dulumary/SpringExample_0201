package com.marondal.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.mybatis.domain.Review;
import com.marondal.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// 전달된 id를 가진 리뷰 정보 돌려주는 기능
	public Review getReview(int id) {
		Review review = reviewRepository.selectReview(id);
		return review;
	}

}
