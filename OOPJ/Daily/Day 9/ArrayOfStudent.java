class Student
{
	int rollNo;
	String name;
	String college;
	
	Student()
	{}
	
	Student(int rollNo, String name, String college)
	{
		this.rollNo = rollNo;
		this.name =  name;
		this.college = college;
	}

	public void printDetails()
	{
		System.out.println(rollNo+", "+name+", "+college);
	}
	
}

public class ArrayOfStudent
{
	public static void main (String args[])
	{
		Student[] stud = new Student[3];
			
		stud[0] = new Student(1,"Pragati","GGSF");
		stud[1] = new Student(2,"Pooja","GGSP");
		stud[2] = new Student(3,"Prachi","IIT");
		
		stud[0].printDetails();
		stud[1].printDetails();
		stud[2].printDetails();
	}
}