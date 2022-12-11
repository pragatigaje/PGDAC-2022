class Demo
{
	int a = 5;
	int b = 10;
	static int c = 50;
	
	void fun1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	void fun2()
	{}
	
	static void fun3()
	{
		// System.out.println(a);
		// System.out.println(b);
		System.out.println(c);
	}
	
	static void fun4()
	{}
	
}

class StaticDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo.fun3();
		Demo.fun1();
	}
}