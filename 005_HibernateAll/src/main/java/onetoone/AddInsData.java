package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Instructor;
import model.Instructor_detail;



public class AddInsData {
	public static void main(String[] args) {
		

		SessionFactory sf = new Configuration()
						.configure("resources/hibernate.cfg.xml")
						.addAnnotatedClass(Instructor.class)
						.addAnnotatedClass(Instructor_detail.class)
						.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Instructor_detail datails = new Instructor_detail();
		datails.setInsd_channel("Learn_java");
		
		Instructor ins = new Instructor();
		ins.setIns_name("Krushit");
		ins.setInstructor_detail(datails);
		
		session.save(ins);
		
		tx.commit();
		
		
		
	}
}
