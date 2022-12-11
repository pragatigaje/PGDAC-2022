class Demo
{
	int a;
	int b;
	static int count;
	
	void myFun()
	{
		System.out.println("myFun Called");
	}
	
	static void anotherFun()
	{
		System.out.println("anotherFun Called");
	}
}

public class StaticDemo
{
	public static void main(String args[])
	{
		//Demo  d1 = new Demo();
		Demo.anotherFun();
		//d1.myFun();
		System.out.println(Demo.count);
	}
}