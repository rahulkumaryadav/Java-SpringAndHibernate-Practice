package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	
	private List<Student> theStudent;
	
	@PostConstruct
	public void loadData() {
		theStudent =new ArrayList<Student>();
		theStudent.add(new Student("Rahul","Yadav"));
		theStudent.add(new Student("Jijesth","Candy"));
		theStudent.add(new Student("prahlad","Pawar"));
	}

	//define end point for "student" -return the list of the student
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return theStudent;
	}
	
	//define end point for  "/students/{stdentId}" return student at index
	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if((studentId>=theStudent.size())||(studentId<0)) {
			System.out.println("step 1");
			throw new StudentNotFoundException("Student id not found -"+studentId);
		}
		
		return theStudent.get(studentId);
	}
	
	
	
	
	
}
