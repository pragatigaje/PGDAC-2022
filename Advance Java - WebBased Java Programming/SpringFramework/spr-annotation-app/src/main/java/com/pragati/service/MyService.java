package com.pragati.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pragati.dao.MyDao;

@Component
public class MyService {
	@Autowired
	private MyDao myDao;

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}
	
	public void add() {
		System.out.println("add() called");
		myDao.save();
	}
}
