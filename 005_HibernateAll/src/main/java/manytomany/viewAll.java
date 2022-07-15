package manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Instructor;
import model.Instructor_detail;
import model.Student;



public class viewAll {
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
		
		for(Student s : c1.getStudents())
		{
			System.out.println(s.getSid()+" "+s.getSname());
		}
		
		System.out.println(c1.getInstructor().getIns_id()+" "+c1.getInstructor().getIns_name());;
		System.out.println(c1.getInstructor().getInstructor_detail().getInsd_id()+" "+c1.getInstructor().getInstructor_detail().getInsd_channel());
		
		tx.commit();
		
		
		
	}
}
