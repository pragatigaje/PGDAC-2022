package com.pragati;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragati.model.Car;
import com.pragati.service.CarService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		CarService carService = (CarService)appCntx.getBean(CarService.class);

//		Insert	
//		Car car = new Car("Tiger", "Tata", 5.69f);
//		carService.add(car);

//		Update	
		Car car = new Car(7,"Tigor", "Tata", 5.69f);
		carService.modify(car);
		
//		Delete
//		carService.removeById(5);
		
//		Select one row
//		Car car = carService.getById(1);
//		System.out.println(car);
		
//		Select all
//		List<Car> lst = carService.getAll();
//		lst.forEach(ele->System.out.println(ele));
		
		
		System.out.println("done");
	}
}
