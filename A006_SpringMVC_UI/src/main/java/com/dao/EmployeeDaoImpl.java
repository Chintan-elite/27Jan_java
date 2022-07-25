package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrUpdateEmp(Employee emp) {
	
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(emp);

	}

	@Override
	public List<Employee> getAllEmp() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Employee").list();
	}

	@Override
	public Employee getById(int id) {
		
		Session s = sessionFactory.getCurrentSession();
		return s.get(Employee.class, id);
	}

	@Override
	public void deleteEmp(int id) {
		
		Session s = sessionFactory.getCurrentSession();
		Employee e =  s.get(Employee.class, id);
		s.delete(e);

	}

}
