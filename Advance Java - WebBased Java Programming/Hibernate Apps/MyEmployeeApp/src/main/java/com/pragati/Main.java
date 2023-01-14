package com.pragati;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
//		create and insert new
//		Employee emp = new Employee(107, "vishnu", 15890.90f, "it", new Date());
//		s.save(emp);
		
		//update
//		Employee emp = new Employee(102, "pragati", 15890.90f, "it", new Date());
//		s.save(emp);
		
		//delete using id 
//		Employee emp = new Employee(102);
//		s.delete(emp);
		
		//get an object for particular row having primary key value 101
		Employee emp = (Employee) s.get(Employee.class , 101);
		System.out.println(emp);
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");

	}

}
