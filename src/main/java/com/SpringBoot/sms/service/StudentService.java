package com.SpringBoot.sms.service;

import java.util.List;

import com.SpringBoot.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	void saveStudent(Student student);
	
	Student getStudentById(Integer id);
	
	void deleteStudentById(Integer id);

}
