package com.pragati;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.pragati.model.Student;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session session = sf.openSession();
		Transaction transac = session.beginTransaction();
		
//		Student s = (Student)session.load(Student.class, 1);
//		System.out.println(s.getName());
		
		Student s = (Student)session.get(Student.class, 1);
		System.out.println(s);
//		Student ss = (Student)session.get(Student.class, 1);
//		System.out.println(ss);
		transac.commit();
		session.close();
		sf.close();

	}
}
