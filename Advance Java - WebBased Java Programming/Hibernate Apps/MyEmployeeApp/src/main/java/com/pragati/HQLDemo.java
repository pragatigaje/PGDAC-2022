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

import com.pragati.model.Employee;

public class HQLDemo {
	public static void selectAll(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void selectOrder(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee order by name");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void selectWhere(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = :dpt");
		q.setString("dpt", "support");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}

	public static void selectWhereBetween(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where salary between :sal1 and :sal2");
		q.setFloat("sal1",9080.0f);
		q.setFloat("sal2",12000.50f);
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void selectWhereLike(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where name like :ptn");
		q.setString("ptn", "p%");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	public static void selectOneProp(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select name, salary from Employee");
		List<Object[]> lst = q.list();
		lst.forEach(ele->System.out.println(ele[0]+"	"+ele[1]));
	}
	
	public static void selectMoreProp(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select distinct(dept) from Employee");
		
		List<String> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();		
		s.close();
	}
	
	public static void GroupFunction(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select sum(salary) from Employee");
		List<Double> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void GroupBy(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select dept, sum(salary) from Employee group by dept");
		List<Object[]> lst = q.list();
		lst.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
		t.commit();
		s.close();
	}

	public static void SubQuery(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = (select dept from Employee where name=:nm)");
		q.setString("nm", "shri");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		
		//selectAll(sf);
		//selectOrder(sf);
		//selectWhere(sf);
		//selectWhereBetween(sf);
		//selectWhereLike(sf);
		//selectOneProp(sf);
		//selectMoreProp(sf);
		//GroupFunction(sf);
		//GroupBy(sf);
		SubQuery(sf);
		sf.close();

	}

}
