abstract class First
{
	int a;
	int b;
	
	abstract void myFun();
	void anotherFun()
	{
		System.out.println("another of First");
	}
}

class Second extends First
{
	int c;
	void myFun()
	{}
}

class AbstractDemo
{
	public static void main (String args[])
	{
		
	}
}