package com.sarje;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarje.model.Car;
import com.sarje.service.CarService;

public class Main5 {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService carService = (CarService)appCntx.getBean(CarService.class);
		List<Car> lst = carService.getAll();
		lst.forEach(ele->System.out.println(ele)); 
		System.out.println("done");
	}

}
