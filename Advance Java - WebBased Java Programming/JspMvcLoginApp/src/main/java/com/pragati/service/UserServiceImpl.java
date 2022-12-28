package com.pragati.service;

import com.pragati.dao.UserDao;
import com.pragati.dao.UserDaoImpl;
import com.pragati.model.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public void register(User user) {
		userDao.save(user);
	}

	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}

	@Override
	public void upload(int uid, String image) {
		userDao.upload(uid, image);
		
	}
		
	
}
