package com.luv2code.springboot.cruddemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService1;

/*Rishabh*/


@RequestMapping("/employee")
public class EmployeeController1 {
	
	private EmployeeService1 employeeService1;
	
	public EmployeeController1(EmployeeService1 employeeService1) {
		this.employeeService1=employeeService1;
	}
	
	@GetMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
			System.out.println("employee**************"+employee);
		return ResponseEntity.ok().body(employeeService1.save(employee));
	}

}
