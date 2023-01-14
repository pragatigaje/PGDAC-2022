package com.pragati.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Manager {
	@Id
	private int id;
	private String name;
	@OneToOne
	@JoinColumn(name="no", unique = true)
	private Department dept;
	public Manager() {
		super();
	}
	
	public Manager(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "" + id + "	" + name + "	" + dept;
	}
	
}
