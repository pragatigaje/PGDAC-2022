package mypack;
class F
{
	public int a = 10;
	protected int b = 15;
	int c = 24;
	//private int d = 56;
	
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
	}
}

class S
{
	public static void main(String args[])
	{
		F f1 = new F();
		f1.print();
	}
	
}