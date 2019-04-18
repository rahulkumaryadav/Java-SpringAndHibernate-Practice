package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public interface EmployeeDao  extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmail(String string);

	

	

	
}
