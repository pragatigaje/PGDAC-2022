class Student
{
	int rollNo;
	int age;
	double marks;

	void printDetails()
	{
		System.out.println(rollNo+","+age+","+marks);
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		Student stud1 = new Student();
		stud1.rollNo = 1;
		stud1.age = 20;
		stud1.marks = 75.0;

		Student stud2 = new Student();
		stud2.rollNo = 2;
		stud2.age = 21;
		stud2.marks = 65.0;

		stud1.printDetails();

		stud2.printDetails();
	}
}



