package mypack1;

public class First
{
	public int a;
	private int b;
	int c;			//access specifier here : default
	protected int d;
	
	public void display()
	{
		System.out.println(a);		//OK
		System.out.println(b);		//OK	
		System.out.println(c);		//OK
		System.out.println(d);		//OK
	}
	
	public void fun()
	{
	}
}

