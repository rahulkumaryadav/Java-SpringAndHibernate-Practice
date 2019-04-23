package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;


/*Rishabh*/


@Repository
public interface EmployeeDao1  extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmail(String string);

	

	

	
}
