package com.marondal.spring.ex.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.jpa.domain.Student;
import com.marondal.spring.ex.jpa.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(String name, String phoneNumber, String email, String dreamJob) {
		
		Student student = Student.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamJob)
				.build();
		
		student = studentRepository.save(student);
		return student;
	}
	
	// 특정id의 학생정보중 전달된 장래희망으로 수정하는 기능
	public Student updateStudent(int id, String dreamJob) {
		// update 대상을 조회 한다. 
		// 조회된 객체에서 수정사항을 적용한다. 
		// 해당 객체를 저장한다 
		
		// Optional
		// null 일수도 있는 객체를 리턴할때 쓰이는 클래스
		Optional<Student> optionalStudent = studentRepository.findById(id);
		Student student = optionalStudent.orElse(null);
		
		student = student.toBuilder().dreamJob(dreamJob).build();
		
		student = studentRepository.save(student);
		
		return student;
	}
	
	public void deleteStudent(int id) {
		// 삭제 대상 행을 조회한다.
		// 조회된 객체를 통해 삭제한다. 
		Optional<Student> optionalStudent = studentRepository.findById(id);
		Student student = optionalStudent.orElse(null);
		
		studentRepository.delete(student);
		
	}
}
