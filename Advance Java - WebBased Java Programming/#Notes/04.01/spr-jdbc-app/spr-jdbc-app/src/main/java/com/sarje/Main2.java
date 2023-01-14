package com.sarje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarje.model.Car;
import com.sarje.service.CarService;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService carService = (CarService)appCntx.getBean(CarService.class);
		Car car = new Car(1,"abc", "abc1", 90.67f);
		carService.modify(car);
		System.out.println("done");
	}

}
