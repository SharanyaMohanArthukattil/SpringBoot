package com.example.demo.sms.Service;

import java.util.List;

import com.example.demo.sms.Entity.Student;

public interface StudentSErvice {
	List<Student> getAllStudents();

Student saveStudent(Student student);
Student getStudentById(long id);
Student updateStudent(Student student);
void deleteStudent(long id);




}
