package com.pragati.service;

import com.pragati.model.User;

public interface UserService {
	void register(User user);
	boolean login(User user);
	void upload(int uid, String image);
}
