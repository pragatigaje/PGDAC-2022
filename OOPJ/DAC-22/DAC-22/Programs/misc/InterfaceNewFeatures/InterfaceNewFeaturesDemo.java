interface MyInterface
{
	void fun1();
	static void fun2()
	{
		System.out.println("MyInterface fun2");
	}

	default void fun3() //here default is not for access specifier, it is just default implementation 
				//if it is not overridden by the implementing class.
	{
		System.out.println("MyInterface fun3");
	}

	/*private void fun4()
	{
		//code;
	}

	private static void fun5()
	{
		//code
	}*/
}

class Demo implements MyInterface
{
	public void fun1()
	{
		System.out.println("fun1 of Demo");
	}

	public void fun3()
	{
		System.out.println("Demo fun3");
	}
}

class InterfaceNewFeaturesDemo
{
	public static void main(String args[])
	{
		MyInterface.fun2();

		MyInterface d = new Demo();
		d.fun3();
	}
}
