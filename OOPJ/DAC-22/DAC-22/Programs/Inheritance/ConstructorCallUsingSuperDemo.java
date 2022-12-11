class First
{
	int a;
	
	First ()
	{
		System.out.println("0-arg const of First");
	}
	
	First(int a)			
	{
		System.out.println("1-arg const of First");
		this.a = a;
	}
}

class Second extends First
{
	int b;
	
	Second()
	{
		System.out.println("0-arg const of Second");
	}
	
	Second(int a, int b)
	{
		super();		//superclass 1-arg constructor called. Must be the first statement.
		//super();		//superclass 0-arg constructor called. Must be the first statement.
		this.b = b;
		System.out.println("2-arg const of Second");
	}
	
	void fun()
	{
		//super();	//ERROR.
	}
}

public class ConstructorCallUsingSuperDemo
{
	public static void main(String args[])
	{
		Second s = new Second(5,10);
	}
}
