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
//		Car car = new Car("Tiago", "Tata", 8.69f);
//		carService.add(car);

//		Update	
//		Car car = new Car(7,"Tiago", "Tata", 8.29f);
//		carService.modify(car);
		
//		Delete
//		carService.removeById(8);
		
//		Select one row
//		Car car = carService.getById(6);
//		System.out.println(car);
		
//		Select all
//		List<Car> lst = carService.getAll();
//		lst.forEach(ele->System.out.println(ele));
		
		
		System.out.println("done");
	}
}
