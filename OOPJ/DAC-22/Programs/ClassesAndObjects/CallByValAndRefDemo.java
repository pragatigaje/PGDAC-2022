class Demo
{
	int a;
	int b;
	
	Demo()
	{
		a = 0;
		b = 0;
	}
	
	Demo(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void increment(int x, int y)
	{
		x++;
		y++;
	}
	
	void change(Demo d)
	{
		d.a++;
		d.b++;
	}
	
	void print()
	{
		System.out.println("a = " + a + " b = " + b);
	}
}

public class CallByValAndRefDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(5,10);
		
		int x = 2;
		int y = 4;
		
		System.out.println("Before call (by value) x = " + x + " y = " + y);
		
		d1.increment(x,y);		//call by value
		
		System.out.println("After call (by value) x = " + x + " y = " + y);
		
		
		Demo d2 = new Demo(20,30);
		
		System.out.println("Before call (by reference)");
		d2.print();
		
		d1.change(d2); 			//call by reference
		
		System.out.println("After call (by reference)");
		d2.print();
		
	}
}
