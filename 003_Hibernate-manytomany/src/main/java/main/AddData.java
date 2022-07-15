package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class AddData {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
						.configure("resources/hibernate.cfg.xml")
						.addAnnotatedClass(Candidate.class)
						.addAnnotatedClass(Course.class)
						.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
//		Course cs1 = new Course();
//		cs1.setCourseName("Android");
//		Course cs2 = new Course();
//		cs2.setCourseName("Php");
//		Candidate c1 = new Candidate();
//		c1.setCandidateName("Krushit");
//		c1.addCourse(cs1);
//		c1.addCourse(cs2);
		
//		Candidate c1 = new Candidate();
//		c1.setCandidateName("Mohini");
//		
//		Candidate c2 = new Candidate();
//		c2.setCandidateName("Bhumika");
//		
//		
//		Course cs1 = new Course();
//		cs1.setCourseName("Java");
//		cs1.addCandidate(c1);
//		cs1.addCandidate(c2);
		
//		session.save(cs1);
//		session.save(c1);
//		session.save(cs2);
		
		Course c1 = session.load(Course.class, 2);
		
		Candidate cs1 = new Candidate();
		cs1.setCandidateName("Tops");
		cs1.addCourse(c1);
		
		
		session.save(cs1);
		
		tx.commit();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
