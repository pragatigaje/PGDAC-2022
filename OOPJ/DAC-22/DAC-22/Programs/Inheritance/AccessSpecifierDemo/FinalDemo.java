final class First
{
	final int num;	//final instance variable

	First()
	{
		num = 1;		//first time initialization for num, so OK
		//num = 5;		//As already initialized, so ERROR
	}

	final void myFun()
	{
		System.out.println("myFun of First");
	}
}

class Second extends First
{
	/*void myFun()		//ERROR, as myFun() is final in First.
	{
		System.out.println("myFun of Second");
	}*/
}

class FinalDemo
{
	public static void main(String args[])
	{
		final int a = 5;	//final local variable
		//a = 10;		//Compilation Error
		System.out.println(a);

		First f = new First();

	}
}
