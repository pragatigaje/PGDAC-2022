class First
{
	static void myFun()
	{
		System.out.println("myFun of First");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of First");
	}
	
	//code
}

class Second extends First
{
	static void myFun()	//Method hiding, without static here it will give compilation error.
	{
		System.out.println("myFun of Second");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of Second");
	}
	
	//code
}

class MethodHidingDemo
{
	public static void main(String args[])
	{
		Second f = new Second();
		f.myFun();
		f.anotherFun();
	}
}

