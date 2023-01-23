package com.SpringBoot.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SpringBoot.sms.entity.Student;
import com.SpringBoot.sms.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
	private StudentRepository repository;

	@Override
	public List<Student> getAllStudent() {

		return repository.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		this.repository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional = repository.findById(id);
		Student student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException("Student not Found for id:: " + id);
		}
		return student;

	}

	@Override
	public void deleteStudentById(Integer id) {
		this.repository.deleteById(id);
	}

}
