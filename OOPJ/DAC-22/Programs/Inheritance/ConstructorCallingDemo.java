class First
{
	int a;
	
	First()
	{
		System.out.println("Zero-arg const of First");
		a = 1;
	}
}

class Second extends First
{
	int b;
	
	Second()
	{
		System.out.println("Zero-arg const of Second");
		b = 2;
	}
}

public class ConstructorCallingDemo
{
	public static void main(String args[])
	{
		new Second();
	}
}

