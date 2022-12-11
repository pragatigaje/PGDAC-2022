class Demo
{
	int a;
	int b;
	int c;
	
	Demo()
	{
		System.out.println("zero-arg const called");
		a = 0;
		b = 0;
		c = 0;
	}
	
	Demo(int a)
	{
		this();			//calling the 0-arg constructor
		System.out.println("one-arg const called");
		this.a = a;
	}
	
	Demo(int a, int b)
	{
		this(a);		//calling the 1-arg constructor with the value of a
		System.out.println("two-arg const called");
		this.b = b;
	}
	
	Demo(int a, int b, int c)
	{
		this(a,b);		//calling the 2-arg constructor with the value of a & b
		System.out.println("three-arg const called");
		this.c  = c; 
	}
	
	void myFun()
	{
		//this(5,6,7);		//ERROR
	}
	
	void print()
	{
		System.out.println("a = " + a + " b = " + b + " c = " +c);
	}
}

public class ConstructorCallingUsingThisDemo
{
	public static void main(String args[])
	{
		Demo d = new Demo(5,10,15);
		d.print();
	}
}
