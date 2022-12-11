class Demo
{
	int rollNo;
	String name;
	double marks;
	
	Demo()
	{
		System.out.println("I am Default");
	}

	Demo (int rollNo, String name, double marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	void printDetails()
	{
		System.out.println(rollNo+" "+name+" "+marks);
	}
}

public class This1 
{
	public static void main (String args[])
	{
		Demo d = new Demo (01,"Pragati",56.25);
		d.printDetails();
	}
}