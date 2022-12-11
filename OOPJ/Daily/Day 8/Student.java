class Student
{
	int rollNo;
	int age;
	double marks;
	
	void printDetails()
	{
		System.out.println(rollNo+" "+age+" "+marks);
	}
}


class StudentDemo
{
	public static void main (String args[])
	{
		Student s1 = new Student();
		s1.rollNo = 10;
		s1.age = 20;
		s1.marks = 440;
		
		Student s2 = new Student();
		s2.rollNo = 10;
		s2.age = 20;
		s2.marks = 440;
		
		s1.printDetails();
		s2.printDetails();
		
	}
}