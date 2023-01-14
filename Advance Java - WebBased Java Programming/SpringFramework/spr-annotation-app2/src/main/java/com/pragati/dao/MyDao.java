package com.pragati.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	public void save() {
		System.out.println("save called()");
	}
}
