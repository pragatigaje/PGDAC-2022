package com.pragati.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Department {
	@Id
	private int no;
	private String name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "	"+ no + "	" + name;
	}
		
}
