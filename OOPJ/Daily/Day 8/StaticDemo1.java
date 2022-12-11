//Java Program to demonstrate the use of static variable  
class Student
{
	int roll;
	String name;
	static String college ="Guru Gobind Singh Foundation";
	
	Student (int r, String n)
	{
		roll = r;
		name = n;
	}
	
	void printDetails()
	{
		System.out.println(roll+", "+name+", "+college);
	}
}

public class StaticDemo1
{
	public static void main(String args[])
	{
		Student s1 = new Student(111,"Pragati");
		Student s2 = new Student(112,"Harshank");
		Student s3 = new Student(113,"Vishnu");
		Student s4 = new Student(114,"Sanjyot");
		
		 //we can change the college of all objects by the single line of code  
		//Student.college="BBDIT";
		
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
		s4.printDetails();
	}
}