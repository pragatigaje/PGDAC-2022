package com.pragati;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragati.comp.MyBeanClass;

public class Main {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		// get bean object from IOC Container
		MyBeanClass mb = (MyBeanClass) appCntx.getBean("my");
		System.out.println(mb.getMsg()); 
	}

}
