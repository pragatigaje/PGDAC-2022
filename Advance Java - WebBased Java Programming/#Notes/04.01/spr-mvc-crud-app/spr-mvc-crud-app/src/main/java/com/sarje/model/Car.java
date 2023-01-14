package com.sarje.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String make;
	private String model;
	private float price;
	public Car() {
	
	}

	public Car(int id) {
		super();
		this.id = id;
	}

public Car(String make, String model, float price) {
	super();
	this.make = make;
	this.model = model;
	this.price = price;
}

public Car(int id, String make, String model, float price) {
	super();
	this.id = id;
	this.make = make;
	this.model = model;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

@Override
public String toString() {
	return id + " " + make + " " + model + " " + price;
}
 
}
