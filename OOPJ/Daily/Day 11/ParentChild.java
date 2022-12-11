class First
{
	int a;
	int b;
}

class Second extends First
{
	int c;
	Demo d;
	
	Second()
	{
		a=0;
		b=0;
		c=0;
		d = new Demo();
	}
	
	void fun()
	{
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d.x);
		System.out.println(d.y);
	}
}
class Demo
{
	int x;
	int y;
}

class ParentChild
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.fun();
	}
}