package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {
	public void addOrUpdateEmp(Employee emp);
	public List<Employee> getAllEmp();
	public Employee getById(int id);
	public void deleteEmp(int id);
}
