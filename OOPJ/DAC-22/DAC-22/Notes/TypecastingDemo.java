class First
{
	void fun()
	{
		System.out.println("fun of First");
	}
}

class Second extends First
{
	void fun()
	{
		System.out.println("fun of Second");
	}
}

class Third
{
	void fun()
	{
		System.out.println("fun of Third");
	}
}

class TypecastingDemo
{
	public static void main(String args[])
	{
		First f = new First();
		Second s = new Second();
		Third t = new Third();
		
		f = s;
		f.fun();	//Second fun()
		
		
	}
}
