package com.marondal.spring.ex.jsp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.marondal.spring.ex.jsp.domain.User;

@Mapper
public interface UserRepository {
	
	 public int insertUser(
			 @Param("name") String name
			 , @Param("birthday") String birthday
			 , @Param("email") String email);
	 
	 
	 // 가장 최근에 삽입된 행 조회 
	 public User selectLastUser();

}
