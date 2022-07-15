package manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Instructor;
import model.Instructor_detail;
import model.Student;



public class AddInsData {
	public static void main(String[] args) {
		

		SessionFactory sf = new Configuration()
						.configure("resources/hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(Instructor_detail.class)
						.addAnnotatedClass(Course.class)
						.addAnnotatedClass(Student.class)
						.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

		Course c1 = session.load(Course.class, 1);
		
		Student s1 = new Student();
		s1.setSname("Bhumika");
		s1.addCourse(c1);
		
		Student s2 = new Student();
		s2.setSname("Mohini");
		s2.addCourse(c1);
		
		session.save(s1);
		session.save(s2);
		
		tx.commit();
		
		
		
	}
}
