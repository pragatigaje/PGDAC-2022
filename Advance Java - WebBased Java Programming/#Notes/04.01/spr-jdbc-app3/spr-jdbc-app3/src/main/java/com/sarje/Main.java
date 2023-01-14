package com.sarje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarje.model.Car;
import com.sarje.service.CarService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService carService = (CarService)appCntx.getBean(CarService.class);
		Car car = new Car("ab", "ab1", 90.67f);
		carService.add(car);
		System.out.println("done");
	}

}
