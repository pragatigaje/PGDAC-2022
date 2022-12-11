class Demo
{
	int a;
	int b;
	static int c;
	
	//static block
	static
	{
		c = 5;
		System.out.println("Inside static block");
	}

	//non-static block
	{
		a = 1;
		b = 2;
		System.out.println("Inside non-static block");
	}

	Demo()
	{
		System.out.println("Inside Demo constructor");
	}

	static void myFun()
	{
		System.out.println("Inside static method myFun and c = "+c);
	}

	void print()
	{
		System.out.println("a = " + a + " b = " + b);
	}
}

public class StaticNonStaticBlockDemo
{
	public static void main(String args[])
	{
		//Demo.myFun();		//Only static block will be executed
		Demo d1 = new Demo();	//Static as well as non-static block will be executed.
		d1.print();

		Demo d2 = new Demo();	//Only non-static block will be executed now as static block is executed only once and in the previous statement, it has already executed.
		d2.print();
	}
}

