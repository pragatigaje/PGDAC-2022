package com.pragati.dao;

import com.pragati.model.User;

public interface UserDao {
	void save(User user);
	Boolean login(User user);
	void upload(int uid, String image);
}
