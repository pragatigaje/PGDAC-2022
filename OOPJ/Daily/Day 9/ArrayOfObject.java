import java.util.*;
class Student
{
	int roll;
	double marks;
	
	Student()
	{}
	
	Student (int roll, double marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
	
	void printDetails()
	{
		System.out.println(roll+" "+marks);
	}
}

class ArrayOfObject
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no of students :");
		int size = sc.nextInt(); 
		Student stud[] = new Student[size];
		
		System.out.println("Enter details of "+size+" students ");
		
		for (int i = 0; i <size-1 ; i++)
		{
			System.out.println("Enter Roll No and Mraks of Student "+(i+1)+" students ");
			int r = sc.nextInt();
			double m = sc.nextDouble();
			stud[i] = new Student (r,m);
		}
		
		System.out.println("Entered details of 5 students are :");
		for (int i = 0; i <size ; i++)
		{
			stud[i].printDetails();
		}
		
	}
}