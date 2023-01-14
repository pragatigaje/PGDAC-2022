package com.pragati.model;
import javax.persistence.*;

@Entity
@Table(name="student_info")
public class Student {
	@Id
	private int id;
	private String name;
	private float marks;
	
	public Student() {
	}

	public Student(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	
	

}