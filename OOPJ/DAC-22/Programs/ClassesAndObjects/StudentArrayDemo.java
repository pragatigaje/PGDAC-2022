import java.util.*;

class Student
{
	//Data
	int roll;
	double marks;
	
	//Methods
	Student()
	{
		roll = 0;
		marks = 0.0;
	}
	
	Student(int roll, double marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
	
	void printDetails()
	{
		System.out.println(roll+","+marks);
	}
}

class StudentArrayDemo
{
	public static void main(String args[])
	{
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of students");
		size = sc.nextInt();
		
		Student stud[] = new Student[size];
		
		System.out.println("Please enter details of the students");
		
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter roll & marks");
			int r = sc.nextInt();
			double m = sc.nextDouble();
			stud[i] = new Student(r,m);
		}
		
		System.out.println("Entered student details are");
		
		for(int i = 0; i < size; i++)
		{
			stud[i].printDetails();
		}
	}
}
