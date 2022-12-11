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

	public int hashCode()
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

	}
	
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

class Stud
{
}

class ListMethodsDemo 
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
		List<Student> list1 = new ArrayList<Student>();

		Student s1 = new Student(1,"Rohit",75.0,20);
		list1.add(s1);

		list1.add(new Student(2,"Manish",65.0,23));
		list1.add(new Student(3,"Geeta",72.0,18));

		list1.add(new Student(4,"Mohit",69.0,21));

		list1.add(new Stud());

		//Iterating using Iterator
		System.out.println("List1 elements: ");
		display(list1);

		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(5,"Mahesh",56.0,19));
		list2.add(new Student(6,"Amisha",67.0,19));

		System.out.println("List2 elements: ");
		display(list2);

		//get(index) method
                Student s = list1.get(2);
                System.out.println("Element at index 2 : ");
                System.out.println(s);

		//add(index, element) method
		list1.add(2,new Student(7,"Mohan",87.0,21));
		System.out.println("List1 after adding Mohan at index 2: ");
		display(list1);

		//add(index, list) method
		list1.addAll(3,list2);
		System.out.println("List2 after adding list2 at index 3: ");
		display(list1);

		//indexOf(element) method
		int i = list1.indexOf(new Student(6,"Amisha",67.0,19));
		System.out.println("Index of Amisha in list1 : "+ i);

		//remove(index) method
		list1.remove(2);
		System.out.println("List1 after removing element at index 2: ");
		display(list1);


	}
}
