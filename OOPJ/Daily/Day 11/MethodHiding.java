class First
{	
	void myFun()
	{
		System.out.println("myFun of First");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of First");
	}
}

class Second extends First
{	
	static void myFun()
	{
		System.out.println("myFun of Second");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of Second");
	}
}

class MethodHiding
{
	public static void main(String args[])
	{
		First f = new Second();
		f.myFun();
		f.anotherFun();
	}
}