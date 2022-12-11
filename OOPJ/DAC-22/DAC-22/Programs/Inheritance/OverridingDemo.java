class First
{
	void myFun(int x, int y)			//Overridden method
	{
		System.out.println("myFun of First");
	}
	
	void anotherFun(int x)
	{
		System.out.println("anotherFun of First");
	}
}

class Second extends First
{
	void myFun(int x, int y)
	{
		System.out.println("myFun of Second");
	}
}

public class OverridingDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(2,5);
	}
}

