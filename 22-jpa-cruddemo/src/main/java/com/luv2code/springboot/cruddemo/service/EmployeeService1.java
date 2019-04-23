package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDao1;
import com.luv2code.springboot.cruddemo.entity.Employee;


/*Rishabh*/

@Service
public class EmployeeService1 {

	private EmployeeDao1 employeeDao1;

	public EmployeeService1(EmployeeDao1 employeeDao1) {
		this.employeeDao1 = employeeDao1;
	}
	
	public List<Employee> findAll(){
		List<Employee> employees = employeeDao1.findAll();
		return employees;
	}
	
	public Employee  save(Employee employee) {
			Employee emp = employeeDao1.save(employee);
			return emp;
	}
	
	
}
