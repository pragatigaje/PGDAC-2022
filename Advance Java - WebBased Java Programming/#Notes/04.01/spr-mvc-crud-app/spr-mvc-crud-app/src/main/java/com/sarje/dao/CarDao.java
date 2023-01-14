package com.sarje.dao;

import java.util.List;

import com.sarje.model.Car;

public interface CarDao {
	void save(Car car);
	void update(Car car);
	void deleteById(int id);
	Car selectById(int id);
	List<Car> selectAll();
}
