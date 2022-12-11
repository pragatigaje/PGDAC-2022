class Student1
{
	int rollNo;
	int age;
	double marks;
	
	void printDetails()
	{
		System.out.println(rollNo+" "+age+" "+marks);
	}
	
	void addDetails (int r, int a, double m)
	{
		rollNo = r;
		age = a;
		marks = m;
	}

}


class StudentDemo
{
	public static void main (String args[])
	{
		Student1 s1 = new Student1();
		s1.rollNo = 10;
		s1.age = 20;
		s1.marks = 440;
		s1.printDetails();
		
		Student1 s2 = new Student1();
		s2.addDetails(20,22,450.0);
		s2.printDetails();
		
	}
}