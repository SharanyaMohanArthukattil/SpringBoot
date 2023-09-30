package com.example.demo.sms;


import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.sms.Entity.Student;
import com.example.demo.sms.Repository.StudentRepository;




@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
private StudentRepository studentRepository;

	@Override
	
	public void run(String... args) throws Exception {
	
	/*	Student student1=new Student("Meera","Anil","meera@gmail.com");
		*studentRepository.save(student1);
		*Student student2=new Student("Heera","Sunil","heera@gmail.com");
		*studentRepository.save(student2);
		*Student student3=new Student("Thara","Milan","thara@gmail.com");
		*studentRepository.save(student3);*/
		
	}



}
