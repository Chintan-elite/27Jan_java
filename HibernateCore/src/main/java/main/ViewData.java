package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class ViewData
{
	public static void main(String[] args) {
		
		  SessionFactory sf =new Configuration()
							.configure("resorces/hibernate.cfg.xml")
							.addAnnotatedClass(Employee.class)
							.buildSessionFactory();
		  Session s = sf.openSession();
		  Transaction tx = s.beginTransaction();
		 
		  Employee emp =  s.load(Employee.class, 2);
		  System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail()+" "+emp.getDept());
		  
		  
	}
}
