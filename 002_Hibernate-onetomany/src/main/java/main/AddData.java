package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class AddData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration()
					.configure("resources/hibernate.cfg.xml")
					.addAnnotatedClass(Product.class)
					.addAnnotatedClass(Category.class)
					.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Category ct = new Category();
		ct.setCatName("Cosmetic");
		
		Product p1 = new Product();
		p1.setpName("Facewash");
		p1.setPrice("5000");
		p1.setCategory(ct);
		
		Product p2 = new Product();
		p2.setpName("SunCream");
		p2.setPrice("50");
		p2.setCategory(ct);
		
		//ct.addProduct(p1);
		//ct.addProduct(p2);
		
		s.save(ct);
		s.save(p1);
		s.save(p2);
		
		tx.commit();
		
		
		
	}
}
