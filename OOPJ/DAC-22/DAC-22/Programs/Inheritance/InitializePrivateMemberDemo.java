class First
{
	private int a;
	
	First()
	{
		System.out.println("First's 0-arg const called");
	}
	
	First(int a)
	{
		System.out.println("First's 1-arg const called");
		this.a = a;
	}
	
	void setA(int a)
	{
		this.a = a;
	}
	
	int getA()
	{
		return a;	
	}
}

class Second extends First
{
	int b;
	
	Second()
	{
		System.out.println("Second's 0-arg const called");
	}
	
	Second(int a, int b)
	{
		super(a);
		this.b = b;
		System.out.println("Second's 2-arg const called");
	}
}

class Third extends Second
{
	int c;
	
	Third()
	{
	}
	
	Third(int a, int b, int c)
	{
		super(a,b);
		/*setA(a);
		this.b = b;*/
		this.c = c;
		System.out.println("Third's 3-arg constructor called");
	}
	
	public void fun()
	{
		System.out.println( getA() );
		System.out.println(b);
		System.out.println(c);
	}
}

class InitializePrivateMemberDemo
{
	public static void main(String args[])
	{
		Third tobj = new Third(5,10,15); 
		tobj.fun();
		
		First fobj = new First(25);
		System.out.println(fobj.getA());
		
		//fobj.a = 50;	//Error, a is private, not accessible.
		fobj.setA(50);
		
		
	}
}

	






