package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.dao.EmployeeDao;
import com.luv2code.springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeRestController(EmployeeDao employeeDao){
		this.employeeDao=employeeDao;
	}
	
	@GetMapping("/employee")
	public List<Employee> firdAll(){
		System.out.println("EmployeeRestController ---->employee");
		List<Employee> employeeList=employeeDao.findAll();
		System.out.println(employeeList);
		return employeeList;
	}
	
	
	
	
	
	
	
}
