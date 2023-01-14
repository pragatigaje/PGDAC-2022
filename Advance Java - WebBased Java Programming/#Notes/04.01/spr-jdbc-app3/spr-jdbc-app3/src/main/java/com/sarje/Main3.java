package com.sarje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarje.model.Car;
import com.sarje.service.CarService;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService carService = (CarService)appCntx.getBean(CarService.class);
		
		carService.removeById(5);
		System.out.println("done");
	}

}
