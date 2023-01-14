package com.pragati.model;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
public class Manager extends Employee{
	private float da;
	private float ta;
	
	public Manager() {
		
	}
	public Manager(int id, String name, float salary, float da, float ta) {
		super(id, name, salary);
		this.da = da;
		this.ta = ta;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	public float getTa() {
		return ta;
	}
	public void setTa(float ta) {
		this.ta = ta;
	}
	@Override
	public String toString() {
		return super.toString()+"	" + da + "	" + ta;
	}
	
	
		
}
