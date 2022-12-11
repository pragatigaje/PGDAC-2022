class Parent
{
	void m1()
	{
		System.out.println("Parent Method");
	}
}

class Child extends	Parent
{
	void m2()
	{
		System.out.println("Child Method");
	}
}

public class Test1 
{
	public static void main (String args[])
	{
		Parent p = new Parent();
		p.m1();
		// p.m2();
		
		Child c =new Child();
		c.m1();
		c.m2();
		
		Parent p1 = new Child();
		p1.m1();
		// p.m2();
		
		Child c1 = new Parent();
		
		
	}
}