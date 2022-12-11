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


class HashMapDemo1 
{

	public static void main(String args[])
	{
		Map<Integer,Student> map1 = new HashMap<Integer,Student>();
		Student s1 = new Student(1,"Rohit",65.0,21);
		Student s2 = new Student(2,"Mukesh",56.0,23);

		//Add element to map
		map1.put(1,s1);
		map1.put(2,s2);

		map1.put(3,new Student(3,"Geeta",73.0,20));
		map1.put(4,new Student(4,"Manisha",63.0,21));

		//Retrieve element from map
		Student s = map1.get(3);
		System.out.println(s);

		//Iterating map using entrySet()
		Set<Map.Entry<Integer,Student>> set1 = map1.entrySet();

		System.out.println("Map1 elements : " );
		for(Map.Entry<Integer,Student> entry : set1)
		{
			System.out.println(entry);
		}

		System.out.println("Map1 elements (Only values): " );
		for(Map.Entry<Integer,Student> entry : set1)
		{
			System.out.println(entry.getValue());

		}

		System.out.println("Map1 elements (Only keys): " );
                for(Map.Entry<Integer,Student> entry : set1)
                {
                        System.out.println(entry.getKey());

                }

		//keySet() method
		Set<Integer> kset1 = map1.keySet();
		System.out.println("Map1 keys retrieved through keySet():");
		
		for(Integer k : kset1)
		{
			System.out.println(k);
		}

		//values() method
		Collection<Student> elements = map1.values();
		System.out.println("Map1 elements/values retrieved through values() method : ");
		for(Student  st : elements)
		{
			System.out.println(st);
		}


	}
}
