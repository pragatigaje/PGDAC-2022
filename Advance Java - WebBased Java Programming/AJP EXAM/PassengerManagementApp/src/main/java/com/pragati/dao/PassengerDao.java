package com.pragati.dao;

import java.util.List;

import com.pragati.model.Passenger;

public interface PassengerDao {
	void save(Passenger passenger);
	List<Passenger> selectAll(int uid);
	void deleteById(int id);
	Passenger selectById (int id);
	void update(Passenger passenger);
}
