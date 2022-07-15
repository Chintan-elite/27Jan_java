package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class DeleteData {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
		
//	Product p= s.load(Product.class, 1);
//	s.delete(p);
	Category ct = s.load(Category.class, 1);
	s.delete(ct);
	
	tx.commit();
		
		
	}
}
