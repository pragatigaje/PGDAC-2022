class First
{
	int a = 200;
	public int b = 10;
	protected int c = 56;
	private int d = 69;
	
}

class Second extends First
{
	void print()
	{
		System.out.println(a);	//HOW?
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Test4
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.print();
	}
}
