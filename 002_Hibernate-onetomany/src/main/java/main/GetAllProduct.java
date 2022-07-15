package main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class GetAllProduct {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();
	
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	
	//all product
//	List<Category> cats = s.createQuery("from Category").list();
//	for(Category cat : cats)
//	{
//		System.out.println(cat.getcId()+" "+cat.getCatName());
//		for(Product p : cat.getProduct())
//		{
//			System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice());
//		}
//	}
	
	//product by cate
	
//	Category c = s.load(Category.class, 2);
//	
//	System.out.println(c.getcId()+" "+c.getCatName());
//	for(Product p : c.getProduct())
//	{
//			System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice());
//    }
	
	//cat by product
		
		Product p = s.load(Product.class, 1);
		System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice()+" "+p.getCategory().getCatName());
		
	}
}
