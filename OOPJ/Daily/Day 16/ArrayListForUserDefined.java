import java.util.*;

class Student
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
		if(this.marks > s.marks)
			return 1;
		if(this.marks < s.marks)
			return -1;
		return 0;
		
	}
	
}


class ArrayListForUserDefined
{
	public static void display(List<Student> mylist)
	{
		Iterator<Student> it = mylist.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
		
		
	}
	
	public static void main(String args[])
	{
		Boolean b;
		List<Student> list1 = new ArrayList<>();
		Student s1 = new Student(1,"Pragati",88.0);
		list1.add(s1);
		
		list1.add(new Student(2,"Pooja",89.0));
		list1.add(new Student(3,"Prachi",78.0));
		list1.add(new Student(4,"Nikita",79.5));
		//display(list1);		
		System.out.println("--------------------------------------------------");
		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(5,"Paraga",79.0));
		list2.add(new Student(6,"Prakhar",56.0));
		//display(list2);
		System.out.println("--------------------------------------------------");

		list1.addAll(list2);
		//display(list1);
		System.out.println("--------------------------------------------------");
	
		Student s2 = new Student(4,"Nikita",79.5);
		b = list1.contains(s2);
		System.out.println("list1.contains(s2) :"+b);
		System.out.println("--------------------------------------------------");		
		
		//remove() method
		list1.remove(1);
		System.out.println("list1.remove(s2) : ");
		//display(list1);
		System.out.println("--------------------------------------------------");
		//display(list2);
		System.out.println("--------------------------------------------------");
	
		b = list1.contains(s2);
		System.out.println("list1.contains(s2) :"+b);
		System.out.println("--------------------------------------------------");
		
		display(list1);
		
		
	
	}
}