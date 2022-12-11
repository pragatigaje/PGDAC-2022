class Student
{
	int rollNo;
	String name;
	int marks; 
	
	void printDetails()
	{
		System.out.println(rollNo+" "+name+" "+marks);
	}
	
	Student() // zero args 
	{
		System.out.println("I am Zero arg Constructor");
	}
	
	
	Student(int rollNo, String name, int marks)
	{
		rollNo=rollNo;
		name=name;
		marks=marks;
	}

}

public class  ConstructorWithThis
{
	public static void main (String args[])
	{
		Student s1 = new Student(1, "Pragati", 451);
		Student s2 = new Student(2, "Pooja", 499);
		Student s3 = new Student(3, "Nikita", 489);
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
	}
}