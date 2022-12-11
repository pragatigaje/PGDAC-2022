class First
{
	void fun1()
	{
		System.out.println("Fun 1 of First");
	}
	void fun2()
	{
		System.out.println("fun2 of First");
	}
}

class Second extends First
{
	/*void fun1()
	{
		System.out.println("Fun 1 of Second");
	}
	*/
	void fun2()
	{
		System.out.println("Fun 2 of Second");
	}
	
	void fun3()
	{
		System.out.println("Fun 3 of Second");
	}
}

class DemoRef
{
	public static void main(String args[])
	{
		First f = new Second();
		f.fun1();
		f.fun2();
		//f.fun3();
		
		Second s = new Second ();
		s.fun1();
		s.fun2();
		s.fun3();
	}
}