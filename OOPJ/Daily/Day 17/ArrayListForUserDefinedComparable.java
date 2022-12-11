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
		/*if(this.marks > s.marks)
			return 1;
		if(this.marks < s.marks)
			return -1;
		return 0;
		*/
		
		//Comparison based on name
		//return this.name.compareTo(s.name);
		
		//Comparison based on roll
		if (this.roll > s.roll)
			return 1;
		if (this.roll < s.roll)
			return -1;
		return 0;
	
		
		/* //Comparison using wrapper class
		Double marks1 = this.makrs;
		Double marks2 = s.makrs;
		return marks1.compareTo(marks2);
		*/
		
	}
	
}


class ArrayListForUserDefinedComparable
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
		
		list1.add(new Student(8,"Pooja",89.0));
		list1.add(new Student(9,"Prachi",78.0));
		list1.add(new Student(2,"Nikita",79.5));
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
		
		display(list1);
		System.out.println("--------------------------------------------------");
		Collections.sort(list1);
		System.out.println("Sorting based on Roll No :");
		display(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("Sorting reverse based on Roll No :");
		display(list1);
		
		
		
		
	
	}
}