package com.marondal.spring.ex.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.marondal.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	// 1행 삽입 
	// 수정기능
	// 삭제 기능
	// 모든행 조회 기능
	// primary key 기반 조회 기능
	
	// id기준으로 내림차순으로 정렬한 모든 행 조회
	// ORDER BY `id` DESC
	public List<Student> findAllByOrderByIdDesc();
	
	// id를 기준으로 내림차순으로 정렬후 세개만 조회
	// ORDER BY `id` DESC LIMIT 3
	public List<Student> findTop3ByOrderByIdDesc();
	
	// 전달받은 값과 일치하는 name 컬럼을 가진 행 조회 
	// WHERE `name` = #{name}
	public List<Student> findByName(String name);
	
	// 전달 받은 값들과 일치하는 name컬럼을 가진 행 조회 
	// WHERE `name` IN ('유재석', '조세호')
	public List<Student> findByNameIn(List<String> nameList);
	
	// 전달 받은 값이 포함된 email 컬럼을 가진 행 조회 
	// WHERE `email` LIKE '%naver%'
	public List<Student> findByEmailContaining(String email);
	
	// id 컬럼의 값이 특정값 사이에 대응되는 데이터를 id 기준으로 내림차순으로 조회 
	// WHERE `id` BETWEEN 1 AND 7 ORDER BY `id` DESC
	public List<Student> findByIdBetweenOrderByIdDesc(int start, int end);
	
	// 쿼리를 활용한 조회 
	// dreamJob 컬럼이 일치하는 데이터 조회
	@Query(value="SELECT * FROM `new_student` WHERE `dreamJob` = :dreamJob", nativeQuery=true)
	public List<Student> findByDreamJobQuery(@Param("dreamJob") String dreamJob);
	
}
