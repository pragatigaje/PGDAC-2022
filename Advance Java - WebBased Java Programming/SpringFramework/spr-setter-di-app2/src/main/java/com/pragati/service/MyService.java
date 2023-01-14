package com.pragati.service;

import com.pragati.dao.MyDao;

public class MyService {
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
