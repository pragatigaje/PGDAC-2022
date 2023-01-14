package com.pragati.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Employee {
		@Id
		private int id;
		private String name;
		private float salary;
		private String dept;
		@Temporal(TemporalType.DATE)
		private Date hdate;
	public Employee(int id, String name, float salary, String dept, Date hdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.hdate = hdate;
	}
	public Employee() {
	}
	public Employee(int id) {
		this.id=id;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getDate() {
		return hdate;
	}
	public void setDate(Date date) {
		this.hdate = date;
	}
	@Override
	public String toString() {
		return "" + id + "  " + name + "	" + salary + "	" + dept + "	" + hdate;
	}
	
	
}
