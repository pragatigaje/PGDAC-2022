package com.pragati.service;

import java.util.List;

import com.pragati.dao.PassengerDao;
import com.pragati.dao.PassengerDaoImpl;
import com.pragati.model.Passenger;

public class PassengerServiceImpl implements PassengerService{

	private PassengerDao passengerDao;
	
	public PassengerServiceImpl() {
		passengerDao = new PassengerDaoImpl();
	}

	@Override
	public void add(Passenger passenger) {
		passengerDao.save(passenger);
	}

	@Override
	public List<Passenger> getAll(int uid) {
		return passengerDao.selectAll(uid); 
	}

	@Override
	public void removeById(int id) {
		passengerDao.deleteById(id);
	}

	@Override
	public Passenger getById(int id) {
		return passengerDao.selectById(id); 
	}

	@Override
	public void modify(Passenger passenger) {
		passengerDao.save(passenger);
	}
	
}
