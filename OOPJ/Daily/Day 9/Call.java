class Demo
{
	int a;
	int b;
	
	Demo()
	{}
	
	Demo(int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void increment(int x , int y)
	{
		x++;
		y++;
		System.out.println("x = "+x+" y = "+y);
	}
	
	void change(Demo d)
	{
		d.a = d.a++;
		d.b = d.b++;
	}
	
	void print()
	{
		System.out.println("a = "+a+" b = "+b);
	}
}

class Call
{
	public static void main(String args[])
	{
		Demo d1 = new Demo ();
		
		int x = 2;
		int y = 4;
		d1.increment(x,y);		//call by value
		System.out.println("x = "+x+" y = "+y);
	}
}