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

//Comparator interface

//comparator class for age
class StudentAgeComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.age > s2.age)
			return 1;
		
		if(s1.age < s2.age)
			return -1;
			
		return 0;
	}
}

//comparator class for roll
class StudentRoleComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.roll > s2.roll)
			return 1;
		
		if(s1.roll < s2.roll)
			return -1;
			
		return 0;
	}
}

class ArrayListForUserDefinedObjects
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

		//Iterating using Iterator
		System.out.println("List1 elements: ");
		display(list1);

		List<Student> list2 = new ArrayList<Student>();
		list2.add(new Student(5,"Mahesh",56.0,19));
		list2.add(new Student(6,"Amisha",67.0,19));

		System.out.println("List2 elements: ");
		display(list2);

		//addAll() method.
		list1.addAll(list2);
		System.out.println("List1 elements after addAll list2 : ");
		display(list1);

		//contains() method
		boolean b = list1.contains(s1);
		System.out.println("list1.contains(s1) : " + b);

		
		Student s2 = new Student(1,"Rohit",75.0,20);

		b = list1.contains(s2);
		System.out.println("list1.contains(s2) : " + b);
		
		b = list1.contains(new Student(2,"Manish",65.0,21));
		System.out.println("list1.contains(2,Manish,65.0,21) : " + b);

		//remove() method
		list1.remove(s2);
		System.out.println("list1.remove(s2) : ");
		display(list1);

		b = list1.containsAll(list2);		//true;
		System.out.println("list1.containsAll(list2): " + b);
		
		//Sorting the list
		Collections.sort(list1);		//default compareTo() will be called
		System.out.println("List1 after sorting on the basis of marks: ");
		display(list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("List1 after sorting (reverse order) on the basis of marks: ");
		display(list1);
		
		//passing comparator class object
		StudentAgeComparator studAgeComp = new StudentAgeComparator();
		Collections.sort(list1,studAgeComp);	//now StudentAgeComparator compare() will be called
		System.out.println("List1 after sorting on the basis of age: ");
		display(list1);
		
		Collections.sort(list1,Collections.reverseOrder(studAgeComp));
		System.out.println("List1 after sorting (reverse order) on the basis of age: ");
		display(list1);

	}
}
