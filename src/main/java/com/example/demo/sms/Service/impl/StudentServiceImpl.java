 package com.example.demo.sms.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.sms.Entity.Student;
import com.example.demo.sms.Repository.StudentRepository;
import com.example.demo.sms.Service.StudentSErvice;
@Service

public class StudentServiceImpl implements  StudentSErvice {
private StudentRepository studentrepository;

	public StudentServiceImpl(StudentRepository studentrepository) {
	super();
	this.studentrepository = studentrepository;
}

	@Override
	public List<Student> getAllStudents() {
		
		return studentrepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		studentrepository.deleteById(id);
		
	}

	

	
		
	

	

}
