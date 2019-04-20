package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.boot.model.relational.QualifiedSequenceName;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.Employee;


@Repository
public class EmployeeDaoHibernateImpl implements EmployeeDao{
	
	//define field for entity manager
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoHibernateImpl(EntityManager entityManager) {
		this.entityManager=entityManager;
	}

	@Override
	public List<Employee> findAll() {
		
		//get the current hibernate session
		
		Session currentSession= entityManager.unwrap(Session.class);
		
		
		//create a query
		Query<Employee> theQuery= currentSession.createQuery("from Employee",Employee.class);
		
		//execute a query and get result list
		List<Employee> employees= theQuery.getResultList();
		System.out.println("EmployeeDaoHibernateImpl---->findAll"+employees);
		//return the results
		
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		Session currentSession= entityManager.unwrap(Session.class);
		Employee theEmployee= currentSession.get(Employee.class, theId);
		
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		
		//get the current hibernate session
		Session currentSession= entityManager.unwrap(Session.class);
		
		//save employee
		currentSession.saveOrUpdate(theEmployee);
	}

	@Override
	public void deleteById(int theId) {

		//get the current session 
		Session currentSession=entityManager.unwrap(Session.class);
		Query theQuery=currentSession.createQuery("delete form Employee where id=:employeeId");
		theQuery.setParameter("employeeId",theId);
		theQuery.executeUpdate();
	}

}
