package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class AddData2 {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
					.configure("resources/hibernate.cfg.xml")
					.addAnnotatedClass(Product.class)
					.addAnnotatedClass(Category.class)
					.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Category ct = s.load(Category.class, 1);
	
		
		Product p1 = new Product();
		p1.setpName("Cap");
		p1.setPrice("1000");
		p1.setCategory(ct);
		
		
		
		s.save(p1);
		
		tx.commit();
		
		
		
	}
}
