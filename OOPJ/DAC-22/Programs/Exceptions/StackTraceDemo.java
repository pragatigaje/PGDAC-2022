
class Demo
{
	static void fun3()
	{
		System.out.println("Inside fun3");
		int res = 5/0;
	}

	static void fun2()
	{
		System.out.println("Inside fun2");
		fun3();
	}

	static void fun1()
	{
		System.out.println("Inside fun1");
		fun2();
	}
}


class StackTraceDemo
{
	public static void main(String args[])
	{
		System.out.println("Program execution started");
		try
		{
			Demo.fun1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught");
			e.printStackTrace();	
		}
		System.out.println("Program terminated successfully");
	}
}
