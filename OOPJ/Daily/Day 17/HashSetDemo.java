import java.util.*;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	double marks;
	
	Student()
	{}
	
	Student(int roll, String name, double marks)
	{
		this.roll = roll;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString()
	{
	return "Student [ roll = "+roll+", name = "+name+", marks = "+marks+" ] ";
	}

	public int hashCode()
	{
		return (int)(roll+marks);
	}
	
	public boolean equals(Object ob)
	{
		Student s = (Student) ob;
		if (ob == null)
			return false;
		if (this.roll==s.roll && this.name.equals(this.name) && this.marks==s.marks)
			return true;
		else
			return false;
	}

	public int compareTo(Student s)
	{
		//Comparison based on marks
		if(this.marks > s.marks)
			return 1;
		if(this.marks < s.marks)
			return -1;
		return 0;
	
	}
}


class HashsetDemo
{
	public static void display(set<Student> myset)
	{
		Iterator<Student> it = myset.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
		
		
	}
	
	public static void main(String args[])
	{
		Boolean b;
		Set<Student> set1 = new Hashset<>();
		Student s1 = new Student(1,"Pragati",88.0);
		set1.add(s1);
		
		set1.add(new Student(8,"Pooja",89.0));
		set1.add(new Student(9,"Prachi",78.0));
		set1.add(new Student(2,"Nikita",79.5));
		//display(set1);		
		System.out.println("--------------------------------------------------");
		Set<Student> set2 = new Hashset<Student>();
		set2.add(new Student(5,"Parag",79.0));
		set2.add(new Student(6,"Prakhar",56.0));
		//display(set2);
		System.out.println("--------------------------------------------------");
		
		display(set1);
		System.out.println("--------------------------------------------------");
		
	}
}