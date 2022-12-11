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
	
	
	Student(int r, String n, int m)
	{
		rollNo=r;
		name=n;
		marks=m;
		System.out.println("I am three arg Constructor");
	}

}

public class  Constructor
{
	public static void main (String args[])
	{
		Student s1 = new Student(1, "Pragati", 451);
		new Student();
		s1.printDetails();
	}
}