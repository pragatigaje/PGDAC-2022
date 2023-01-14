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

import com.pragati.model.Department;
import com.pragati.model.Employee;

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
		
		Department dept = new Department(10, "cs");
		Employee m = new Employee(101, "pooja");
		m.setDept(dept);
		
		s.save(dept);
		s.save(m);
		

//		Query q = s.createQuery("from Manager");
//		List<Employee> lst = q.list();
//		lst.forEach(ele->System.out.println(ele+" "+ele.getDept()));
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");

	}

}
