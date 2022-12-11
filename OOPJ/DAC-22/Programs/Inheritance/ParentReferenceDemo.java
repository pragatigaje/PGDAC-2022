class First
{
	void fun1()
	{
		System.out.println("fun1 of First");
	}

	void fun2()	//overridden method
	{
		System.out.println("fun2 of First");
	}
}

class Second extends First
{
	void fun2()	//overriding method
	{
		System.out.println("fun2 of Second");
	}

	void fun3()
	{
		System.out.println("fun3 of Second");
	}
}

class ParentReferenceDemo
{
	public static void main(String args[])
	{
		First f;
		f = new Second();
		
		f.fun1();
		f.fun2();
		
		//f.fun3();	//Error
		
		((Second)f).fun3();	//OK

		//Second s = new First();
	}
}
