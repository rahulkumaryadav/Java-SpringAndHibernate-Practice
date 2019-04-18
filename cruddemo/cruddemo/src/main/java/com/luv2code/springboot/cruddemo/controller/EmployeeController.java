package com.luv2code.springboot.cruddemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
			System.out.println("employee**************"+employee);
		return ResponseEntity.ok().body(employeeService.save(employee));
	}

}
