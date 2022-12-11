class Demo
{
	int a;
	int b;
	static int c;
	
	// static 
	static
	{
		c=5;
		System.out.println("Inside static block 2");
	}
	static
	{
		c=5;
		System.out.println("Inside static block 1");
	}
	
	// non-static 
	{
		a=1;
		b=2;
		System.out.println("Inside non-static block");
	}
	{
		a=1;
		b=2;
		System.out.println("Inside non-static block 2");
	}
	
	Demo()
	{
		System.out.println("Demo Constructor");
	}
	
	static void myFun()
	{
		System.out.println("------------------myFun-----------------");
	}
}

class StaticNonStatic
{
	public static void main(String args[])
	{
		Demo.myFun();
		Demo  d1 = new Demo();
		d1.myFun();
		
		Demo  d2 = new Demo();
		d2.myFun();
	

	}
	
}