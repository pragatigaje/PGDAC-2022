import java.util.*;

interface MyInterface
{
	double sum(int x, int y);
}

interface HelloInterface
{
	void print(int val);
}

interface OneInterface
{
	void sayHi();
}

class LambdaExpDemo
{
	public static void main(String args[])
	{
		MyInterface mif1 = new MyInterface(){	//Implementation by anonymous class + object creation
			public double sum(int x, int y)
			{
				return x+y;
			}
		};
		
		double res = mif1.sum(5,10);
		System.out.println("1. " + res);

		//MyInterface mif2 = (int x, int y) -> {return x+y;};
		//MyInterface mif2 = (x, y) -> {return x+y;};
		MyInterface mif2 = (x, y) -> x+y;

		res = mif2.sum(5,10);
		System.out.println("2. " + res);

		//HelloInterface hif1 = (int val) -> { System.out.println("Hello " + val); };
		//HelloInterface hif1 = (val) -> { System.out.println("Hello " + val); };
		//HelloInterface hif1 = val -> { System.out.println("Hello " + val); };
		HelloInterface hif1 = val ->  System.out.println("Hello " + val); 

		hif1.print(5);

		OneInterface oif1 = () -> System.out.println("Hi Friends");
		oif1.sayHi();

		//Iterating List using forEach(FunctionalInterfaceType arg)
		ArrayList <Integer> arrList = new ArrayList<>();
		arrList.add(5);
		arrList.add(10);
		arrList.add(15);
		arrList.add(20);
		arrList.add(25);


		arrList.forEach (i -> {System.out.println("List : "+i);}); //Lambda expression to iterate through collection

		
	}
}

