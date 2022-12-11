class Demo
{
	int a;
	int b;
	static int count;

	Demo()
	{
		count++;
	}

	void myFun()
	{
		System.out.println("myFun of Demo");
	}

	static void anotherFun()
	{
		System.out.println("anotherFun of Demo");
		printTotObjCount();
	}

	static void printTotObjCount()
	{
		System.out.println("Objects created so far : " + count);
	}
}

public class StaticDemo
{
	public static void main(String args[])
	{
		Demo.anotherFun();
		System.out.println(Demo.count);
		//Demo.myFun();		//Error
		Demo.printTotObjCount();
		new Demo();
		new Demo();
		new Demo();

		Demo.printTotObjCount();

		

	}
}
