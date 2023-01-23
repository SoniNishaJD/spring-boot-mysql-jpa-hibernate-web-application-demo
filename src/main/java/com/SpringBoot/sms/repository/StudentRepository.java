package com.SpringBoot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
