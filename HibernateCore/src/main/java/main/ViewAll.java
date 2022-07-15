package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class ViewAll
{
	public static void main(String[] args) {
		
		  SessionFactory sf =new Configuration()
							.configure("resorces/hibernate.cfg.xml")
							.addAnnotatedClass(Employee.class)
							.buildSessionFactory();
		  Session s = sf.openSession();
		  Transaction tx = s.beginTransaction();
		 
		 List<Employee> employee = s.createQuery("from Employee").list();
		  
		 for(Employee emp : employee)
		 {
			  System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail()+" "+emp.getDept());
				
		 }
		  
		  
		  
	}
}
