package com.pragati.dao;

import org.springframework.stereotype.Component;

@Component
public class MyDao {
	public void save() {
		System.out.println("save called()");
	}
}
