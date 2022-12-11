class Demo
{
	public void myFun(int x)
	{
		System.out.println("myFun(int) called ");
	}
	
	public void myFun(String x)
	{
		System.out.println("myFun(String) called ");
	}
	
	public int myFun(int x, int y)
	{
		System.out.println("myFun(int,int) called ");
		return 1;
	}
	
	void anotherFun()
	{
		System.out.println("otherFun() called ");
	}
	
}

public class Overloading
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		d1.myFun("Pragati");
		
	}
}