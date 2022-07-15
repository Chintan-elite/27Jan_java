package main;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;
import model.Emp;

public class HQL {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Candidate.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Criteria criretia = session.createCriteria(Emp.class);
		criretia.list();
		
		
	}
}
