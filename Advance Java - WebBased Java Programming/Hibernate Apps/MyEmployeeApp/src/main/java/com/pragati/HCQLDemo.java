package com.pragati;


import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import com.pragati.model.Employee;

public class HCQLDemo {
	public static void selectAll(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee");
		Criteria c = s.createCriteria(Employee.class);
		List<Employee> lst  =c.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void selectOrder(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria c = s.createCriteria(Employee.class);
		c.addOrder(Order.asc("salary"));
		List<Employee> lst = c.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void selectWhere(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.eq("dept", "support"));
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}

	public static void selectWhereBetween(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.between("salary", 9000.0f, 12000.0f));
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void selectWhereLike(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.like("name","p%"));
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	public static void selectOneProp(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.setProjection(Projections.property("name"));
		List<String> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
	}
	
	public static void selectMoreProp(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList plst = Projections.projectionList();
		plst.add(Projections.property("name"));
		plst.add(Projections.property("dept"));
		plst.add(Projections.property("salary"));
		q.setProjection(plst);
		List<Object[]> lst = q.list();
		lst.forEach(ele->System.out.println(ele[0]+"	"+ele[1]+"	"+ele[2])); 
		t.commit();		
		s.close();
	}
	
	public static void selectDistinct(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.setProjection(Projections.distinct(Projections.property("dept")));
		List<String> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();		
		s.close();
	}
	
	public static void GroupFunction(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.setProjection(Projections.sum(("salary")));
		List<Double> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	
	public static void GroupBy(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.groupProperty("dept"));
		plist.add(Projections.sum("salary"));
		q.setProjection(plist);
		List<Object[]> lst = q.list();
		lst.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
		t.commit();
		s.close();
	}

	public static void SubQuery(SessionFactory sf) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		DetachedCriteria dc = DetachedCriteria.forClass(Employee.class);
		dc.setProjection(Projections.property("dept"));
		dc.add(Restrictions.eq("name", "shiv"));
		
		Criteria q = s.createCriteria(Employee.class);
		q.add(Subqueries.propertyEq("dept", dc));
		
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
		//selectDistinct(sf);
		//GroupFunction(sf);
		GroupBy(sf);
		//SubQuery(sf);
		sf.close();

	}

}
