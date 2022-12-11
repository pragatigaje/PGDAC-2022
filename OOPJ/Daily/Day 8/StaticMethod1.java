class Student
{
	int roll;
	String name;
	static String college ="Guru Gobind Singh Foundation";
	
	//static method to change the value of static variable  
	static void change()
	{
		college = "GCOERC, Nashik";
	}
	
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

class StaticMethod1
{
	public static void main(String args[])
	{
		//Student.change();
		Student s1 = new Student(111,"Pragati");
		Student s2 = new Student(112,"Harshank");
		
		s1.printDetails();
		s2.printDetails();
	}
}