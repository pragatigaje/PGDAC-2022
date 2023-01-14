package com.pragati.service;

import java.util.List;

import com.pragati.model.Passenger;

public interface PassengerService {
	void add(Passenger passenger);
	List<Passenger> getAll (int uid);
	void removeById(int uid);
	Passenger getById(int id);
	void modify(Passenger passenger);
}
