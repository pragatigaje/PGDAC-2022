class Demo
{
	void myFun(int x)
	{
		System.out.println("myFun(int) called");
	}

	void myFun(String x)
	{
		System.out.println("myFun(String) called");
	}

	String myFun(int x, int y)
	{
		System.out.println("myFun(int,int) called");
		int sum = x + y;
		String s = "sum = " + sum;		//String s = "sum = 15";
		return s;
	}

	void anotherFun()
	{
		System.out.println("anotherFun() called");
	}
}

public class MethodOverloadingDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		String res = d1.myFun(5,10);
		System.out.println(res);
	}

}
