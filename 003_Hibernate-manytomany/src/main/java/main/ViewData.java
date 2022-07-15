package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class ViewData {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
						.configure("resources/hibernate.cfg.xml")
						.addAnnotatedClass(Candidate.class)
						.addAnnotatedClass(Course.class)
						.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
//		Course c = session.load(Course.class, 2);
//		System.out.println(c.getCourseId()+" "+c.getCourseName());
//		for(Candidate cd : c.getCandidates())
//		{
//			System.out.println(cd.getCandidateId()+" "+cd.getCandidateName());
//		}
		
		List<Course> courses = session.createQuery("from Course").list();
		for(Course c : courses)
		{
			System.out.println(c.getCourseId()+" "+c.getCourseName());
			for(Candidate cd : c.getCandidates())
			{
				System.out.println(cd.getCandidateId()+" "+cd.getCandidateName());
			}
			System.out.println("*******************");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
