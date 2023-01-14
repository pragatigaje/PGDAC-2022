package com.pragati;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragati.service.MyService;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
		MyService ms = (MyService) context.getBean(MyService.class);
		ms.add();
	}

}
