package com.sarje.service;

import java.util.List;

import com.sarje.model.Car;

public interface CarService {
	void add(Car car);
	void modify(Car car);
	void removeById(int id);
	Car getById(int id);
	List<Car> getAll();
}
