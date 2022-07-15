package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class AddEmp
{
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Savan");
		emp.setEmail("savan@gmail.com");
		emp.setDept("Testing");
		
		
		  SessionFactory sf =new Configuration()
							.configure("resorces/hibernate.cfg.xml")
							.addAnnotatedClass(Employee.class)
							.buildSessionFactory();
		  Session s = sf.openSession();
		  Transaction tx = s.beginTransaction();
		  s.saveOrUpdate(emp);
		  tx.commit();
		
	}
}
