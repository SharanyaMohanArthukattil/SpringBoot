package com.example.demo.sms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.sms.Entity.Student;
import com.example.demo.sms.Repository.StudentRepository;
import com.example.demo.sms.Service.StudentSErvice;

@Controller
public class StudentController {
	
private StudentSErvice studentservice;

public StudentController(StudentSErvice studentservice) {
	super();
	this.studentservice = studentservice;
}
@GetMapping("/students")
public String listStudents(Model model)

{
	model.addAttribute("students", studentservice.getAllStudents());
	return "students";
}
@GetMapping("/students/new")
public  String createStudentForm(Model model)
{
	Student student=new Student();
	model.addAttribute("student", student);
	return "create_student";
	}
@PostMapping("/students")
public String saveStudent(@ModelAttribute("student") Student student)
{
	 studentservice.saveStudent(student);
	return "redirect:/students";
}
@GetMapping("/students/edit/{id}")
public String editStudentForm(@PathVariable long id, Model model)
{
	model.addAttribute("student",studentservice.getStudentById(id));
	return "edit_student";
	}
@PostMapping("/students/{id}")
public String updateStudent(@PathVariable long id,@ModelAttribute("student")Student student,Model model)
{
	Student existingStudent=studentservice.getStudentById(id);
	existingStudent.setId(id);
	 existingStudent.setFirstName(student.getFirstName());
	existingStudent.setLastName(student.getLastName());
	
	existingStudent.setEmail(student.getEmail());
	studentservice.updateStudent(existingStudent);
	return "redirect:/students";
	
}
	
@GetMapping("/students/{id}")
public String deleteStudent(@PathVariable long id)
{
	
studentservice.deleteStudent(id);
return "redirect:/students";
	
}	
	

}

