package com.marondal.spring.ex.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marondal.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	// 1행 삽입 
	// 수정기능
	// 삭제 기능
	// 모든행 조회 기능
	// primary key 기반 조회 기능
}
