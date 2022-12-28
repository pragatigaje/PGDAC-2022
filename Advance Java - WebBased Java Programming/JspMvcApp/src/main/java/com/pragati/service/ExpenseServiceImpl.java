package com.pragati.service;

import java.util.List;

import com.pragati.dao.ExpenseDao;
import com.pragati.dao.ExpenseDaoImpl;
import com.pragati.model.Expense;

public class ExpenseServiceImpl implements ExpenseService{

	private ExpenseDao expenseDao; 
	public ExpenseServiceImpl() {
		expenseDao = new ExpenseDaoImpl();
	}
	@Override
	
	//In the add method we have passed bean object from expese_add.java
	public void add(Expense expense) {
		//we are calling save method (using object ref of dao class) of ExpenseDaoImpl providing bean object
		//control will go to save method of ExpenseDaoImpl.java
		expenseDao.save(expense);		
	}
	@Override
	public List<Expense> getAll(int uid) {
		return expenseDao.selectAll(uid);
	}
	@Override
	public void removeById(int id) {
		expenseDao.deletById(id);
		
	}
	@Override
	public Expense getById(int id) {
		return expenseDao.selectById(id);
	}
	@Override
	public void modify(Expense expense) {
		expenseDao.update(expense);
		
	}
	
}
