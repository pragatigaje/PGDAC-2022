class Parent
{
	private int a;
	Parent()
	{
		System.out.println("0-args Constructor");
	}
	Parent(int a)
	{
		System.out.println("1-args Constructor");
		this.a=a;
	}
	void setA(int a)
	{
		this.a = a;
	}
	int getA()
	{
		return a;
	}
}
class Child1 extends Parent
{
	int b;
}
class Child2 extends Child1
{
	int c;
	Child2()
	{}
	
	Child2(int a, int b, int c)
	{
		setA(a);
		this.b=b;
		this.c=c;
	}
	
	public void print()
	{
		System.out.println(getA());
		System.out.println(b);
		System.out.println(c);
	}
}
class PrivateMemberInitialization
{
	public static void main (String args[])
	{
		Child2 c = new Child2(10,20,30);
		c.print();
	}
}