package com.pragati;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragati.comp.MyColl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
		MyColl m = (MyColl) context.getBean("coll");
		for(String s : m.getMyArr()) {
			System.out.println(s);
		}
		System.out.println("==============================");
		System.out.println(m.getMyList());
		System.out.println("==============================");
		System.out.println(m.getMySet());
		System.out.println("==============================");
		System.out.println(m.getMyMap());
		System.out.println("==============================");
		System.out.println(m.getMyProps());
	}

}
