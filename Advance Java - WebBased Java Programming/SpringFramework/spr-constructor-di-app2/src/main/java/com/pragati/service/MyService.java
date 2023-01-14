package com.pragati.service;

import com.pragati.dao.MyDao;

public class MyService {
	private MyDao myDao;
	
	
	public MyService(MyDao myDao) {
		System.out.println("constructor called : myDao");
		this.myDao = myDao;
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void add() {
		System.out.println("add() called");
		myDao.save();
	}
}
