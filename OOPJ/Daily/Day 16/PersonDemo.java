import java.util.*;

class Person
{
	private int age;
	private double weight;
	private String dateOfBirth;
	private String address;
	
	setAge(int age)
	{
		this.age=age;
	}
	
	setWeight(double weight)
	{
		this.weight=weight;
	}
	
	setAge(String dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
	}
	
	setAddress(String address)
	{
		this.address=address;
	}
	
	getAge()
	{
		this.age=age;
	}
	
	getWeight()
	{
		this.weight=weight;
	}
	
	getAge()
	{
		this.dateOfBirth=dateOfBirth;
	}
	
	getAddress()
	{
		this.address=address;
	}
	
}

class Student extends Person
{
	
}

class Employee extends Person
{
	
}

class Professor extends Employee
{
	
}

class Technician extends Employee
{
	
}

class PersonDemo
{
	public static void main(String args[])
	{
		
	}
}