package com.pragati.dao;

import java.util.List;

import com.pragati.model.Expense;

public interface ExpenseDao {
	void save(Expense expense);
	 List<Expense> selectAll(int uid);
	 void deletById(int id);
	 Expense selectById(int id);
	 void update(Expense expense);
}
