package com.pragati;


import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pragati.model.Clerk;
import com.pragati.model.Employee;
import com.pragati.model.Manager;

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
		
//		Manager m = new Manager(103, "Pooja", 9090.0f, 789.f, 987.2f);
//		Clerk c = new Clerk(104, "Shri", 7900.0f, 300.0f);
//		s.save(c);
//		s.save(m);
		
		Query q = s.createQuery("from Employee");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");

	}

}
