package com.marondal.spring.ex.jsp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.marondal.spring.ex.jsp.domain.User;

@Mapper
public interface UserRepository {
	
	 public int insertUser(
			 @Param("name") String name
			 , @Param("birthday") String birthday
			 , @Param("email") String email);
	 
	 public int insertUserByObject(User user);
	 
	 
	 // 가장 최근에 삽입된 행 조회 
	 public User selectLastUser();
	 
	 public List<User> selectUserList();
	 
	 // 전달받은 email 값을 가진 행의 개수 조회 
	 public int selectCountEmail(@Param("email") String email);

}
