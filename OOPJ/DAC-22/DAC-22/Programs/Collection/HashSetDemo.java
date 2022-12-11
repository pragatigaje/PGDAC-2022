import java.util.*;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	double marks;
	int age;

	Student()
	{
	}

	Student(int roll, String name, double marks, int age)
	{
		this.roll = roll;
		this.name = name;
		this. marks = marks;
		this.age = age;
	}
	
	public void printNameAndMarks()
	{
		System.out.println("Name = " + name + " Marks = " + marks);
	}

	public String toString()
	{
		return "Student[roll = " + roll + ", name = "+name + ", marks = " + marks + ", age = "+ age + "]";
	}

	/*public int hashCode()
	{

		return (int) (roll+marks+age);
	}

	public boolean equals(Object ob)
	{
		Student s = (Student) ob;
		if(s == null)
			return false;

		if(this.roll == s.roll && this.name.equals(s.name) && this.marks == s.marks && this.age == s.age)
			return true;
		else
			return false;

	}*/
	
	//default comparison : based on marks for sorting
	public int compareTo(Student s)
	{
		//comparison based on marks
		if(this.marks > s.marks)
			return 1;
		if(this.marks < s.marks)
			return -1;
		
		return 0;
	}
}


class TreeSetDemo 
{

	public static void display(Set<Student> myset)
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
		Set<Student> set1 = new TreeSet<Student>();

		Student s1 = new Student(1,"Rohit",75.0,20);
		set1.add(s1);

		set1.add(new Student(2,"Manish",65.0,23));
		set1.add(new Student(3,"Geeta",72.0,18));

		set1.add(new Student(4,"Mohit",69.0,21));
		set1.add(new Student(4,"Mohit",69.0,21));

		//Iterating using Iterator
		System.out.println("Set1 elements: ");
		display(set1);

		Set<Student> set2 = new TreeSet<Student>();
		set2.add(new Student(5,"Mahesh",56.0,19));
		set2.add(new Student(6,"Amisha",67.0,19));

		System.out.println("Set2 elements: ");
		display(set2);


	}
}
