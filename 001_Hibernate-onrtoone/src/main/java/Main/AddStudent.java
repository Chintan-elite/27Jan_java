package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.StudentDetails;

public class AddStudent {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
							.configure("resorces/hibernate.cfg.xml")
							.addAnnotatedClass(Student.class)
							.addAnnotatedClass(StudentDetails.class)
							.buildSessionFactory();
		
		StudentDetails sd = new StudentDetails();
		sd.setFname("Krushit");
		sd.setLname("Vaghani");
		
		Student std = new Student();
		std.setEmail("krushit@gmail.com");
		std.setPass("tops123");
		std.setStudentDetails(sd);
		
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(std);
		
		tx.commit();
		
		
	}
}
