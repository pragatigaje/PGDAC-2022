class Demo
{
	int a;
	int b;
	int c;
	Demo()
	{
		System.out.println("Demo()");
	}
	
	Demo(int a)
	{
		this();
		this.a=a;
		System.out.println("Demo(int)");
	}
	
	Demo(int a, int b)
	{
		this(a);						//
		this.b=b;
		System.out.println("Demo(int,int)");
	}
	
	Demo(int a, int b, int c)
	{
		this(a,b);						// calling 2-args Constructor
		this.c = c;
		System.out.println("Demo(int,int,int)");
	}
	
	void print()
	{
		System.out.println(a+" "+b+" "+c);
	}
}


class ConstructorWithThis
{
	public static void main(String args[])
	{
		Demo d = new Demo(5,15,20);
		d.print();
	}
} 