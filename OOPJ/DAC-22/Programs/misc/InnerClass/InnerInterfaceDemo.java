interface MyInterface
{
	void fun1();
	interface AnotherInterface
	{
		void fun2();
	}
}

//Not mandatory to implement inner interface i.e. AnotherInterface methods for the implementing class First here.
class First implements MyInterface
{
	public void fun1()
	{
		System.out.println("fun1 of First");
	}
}

//Not mandatory to implement the enclosing interface i.e. MyInterface methods for the implementing class Second here.
class Second implements MyInterface.AnotherInterface
{
	public void fun2()
	{
		System.out.println("fun2 of Second");
	}
}

class InnerInterfaceDemo
{
	public static void main(String args[])
	{
		MyInterface f = new First();
		f.fun1();

		MyInterface.AnotherInterface s = new Second();
		s.fun2();
	}
}
