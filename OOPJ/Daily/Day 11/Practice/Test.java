class Test
{
	public int a = 100;
	protected int b = 61;
	int c = 19;
	private int d = 69;
		
	
}

class Test2
{
	public static void main(String args[])
	{	
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		// System.out.println(t.d);
	}
}