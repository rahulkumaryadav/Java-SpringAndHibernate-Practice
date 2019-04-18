package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDao;
import com.luv2code.springboot.cruddemo.entity.Employee;


@Service
public class EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeService(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> findAll(){
		List<Employee> employees = employeeDao.findAll();
		return employees;
	}
	
	public Employee  save(Employee employee) {
			Employee emp = employeeDao.save(employee);
			return emp;
	}
	
	
}
