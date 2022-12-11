class Student
{
	int rollNo;
	int age;
	double marks;

	Student()
	{
		System.out.println("Zero-arg constructor called");
	}


	Student(int rollNo, int age, double marks)
	{
		System.out.println("Three-arg constructor called");
		this.rollNo = rollNo;
		this.age = age;
		this.marks = marks;
	}

	void setDetails(int rollNo, int age, double marks)
	{
		this.rollNo = rollNo;	//similar to rollNo = r;
		this.age = age;
		this.marks = marks;

		printDetails();	//equivalent to this.printDetails(). No need to use this. But if want we can use 
	}

	void printDetails()
	{
		System.out.println(rollNo+","+age+","+marks);
	}
}

public class ThisDemo 
{
	public static void main(String args[])
	{
		Student stud1 = new Student();
		stud1.setDetails(1,20,75.0);

		Student stud2 = new Student();
		stud2.setDetails(2,21,65.0);

	}
}



