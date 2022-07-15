package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Instructor;
import model.Instructor_detail;



public class AddInsData {
	public static void main(String[] args) {
		

		SessionFactory sf = new Configuration()
						.configure("resources/hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(Instructor_detail.class)
						.addAnnotatedClass(Course.class)
						.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
//		Instructor_detail datails = new Instructor_detail();
//		datails.setInsd_channel("Learn_node");
//		
//		Instructor ins = new Instructor();
//		ins.setIns_name("Laxman");
//		ins.setInstructor_detail(datails);
		
		Instructor ins = session.load(Instructor.class, 1);
		
		Course c1 = new Course();
		c1.setCname("Corejava");
		
		Course c2 = new Course();
		c2.setCname("advance Java");
		
		ins.addCourse(c1);
		ins.addCourse(c2);
		
		
		session.save(c1);
		session.save(c2);
		
		tx.commit();
		
		
		
	}
}
