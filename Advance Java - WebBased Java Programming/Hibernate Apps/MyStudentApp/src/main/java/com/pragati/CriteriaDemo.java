package com.pragati;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.pragati.model.Employee;

public class CriteriaDemo {
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c = s.createCriteria(Employee.class);
		List<Employee> lst  = c.list();
		lst.forEach(ele->System.out.println(ele));
		
		s.close();
	}
}
