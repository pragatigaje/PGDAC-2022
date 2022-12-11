class RecursionType1
{
	static int i =0;
	
	static void show()
	{
		++i;
		if (i<=5) // termination condition
		{
			System.out.println("Happy Diwali !!!");
			show(); // recursive call
		}
	}
	
	public static void main(String args[])
	{
		show();
	}
}