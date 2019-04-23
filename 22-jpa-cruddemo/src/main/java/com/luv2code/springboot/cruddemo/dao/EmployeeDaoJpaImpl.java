package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;


@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao{
	
	
	private EntityManager entityManager;
	
	@Autowired
	 public EmployeeDaoJpaImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}

	@Override
	public List<Employee> findAll() {
		//create a query 
		Query theQuery= entityManager.createQuery("from Employee");
		//execute query and get result list
		List<Employee>  employeeList= theQuery.getResultList();
		//return the results
		return employeeList;
	}

	@Override
	public Employee findById(int theId) {
		
		//get the employee
		Employee theEmployee =entityManager.find(Employee.class, theId);
		
		//return the employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		entityManager.persist(theEmployee);
		
	}

	@Override
	public void deleteById(int theId) {
		//delete object with primary key
		Query theQuery= entityManager.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

}
