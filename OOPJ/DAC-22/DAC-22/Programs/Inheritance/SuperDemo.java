class First
{
	int num = 5;
	
	void myFun(int x, int y)			//Overridden method
	{
		System.out.println("myFun of First");
	}
	
	void anotherFun(int x)
	{
		System.out.println("anotherFun of First");
	}
}

class Second extends First
{
	void myFun(int x, int y)		//Just comment this method and check out the output.
	{
		super.myFun(x,y);
		System.out.println("myFun of Second");
		System.out.println(super.num);	//System.out.println(num);
	}
}

public class SuperDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(2,5);		//myFun of Second
		s.anotherFun(5);	//anotherFun of First
	}
}

