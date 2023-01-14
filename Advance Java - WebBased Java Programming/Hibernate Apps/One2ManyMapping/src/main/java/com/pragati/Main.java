package com.pragati;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pragati.model.Category;
import com.pragati.model.Product;


public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

//		Category c = new Category(1, "electric");
//		Product p1 = new Product(10, "fan");
//		Product p2 = new Product(20, "cooler");
//		Product p3 = new Product(30, "tv");
//		
//		c.getProducts().add(p1);
//		c.getProducts().add(p2);
//		c.getProducts().add(p3);
		
		Category c = new Category(2, "electronics");
		Product p4 = new Product(40, "laptop");
		Product p5 = new Product(50, "mobile");
		
		c.getProducts().add(p4);
		c.getProducts().add(p5);
		
		s.save(c);
		s.save(p4);
		s.save(p5);
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");

	}

}
