package com.pragati.model;
import javax.persistence.*;

@Entity
@Table(name="student_info")
public class Student {
	public Student(String string, double d) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, float marks) {
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
	@Override
	public String toString() {
		return "id :" + id + "	name :" + name + "	marks :" + marks;
	}
	
	
}