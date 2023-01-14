package com.pragati.service;

import java.util.List;

import com.pragati.model.Expense;

public interface ExpenseService {
	void add(Expense expense);
	List<Expense> getAll(int uid);
	void removeById(int uid);
	Expense getById(int id);
	void modify(Expense expense);
}
