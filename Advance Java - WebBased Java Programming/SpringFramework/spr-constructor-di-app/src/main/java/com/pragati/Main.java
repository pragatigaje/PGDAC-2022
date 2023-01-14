package com.pragati;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragati.comp.MyBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml");
		MyBean mb = (MyBean) context.getBean("my");
		System.out.println(mb.getMsgId());
		System.out.println(mb.getMsg());
		
	}

}
