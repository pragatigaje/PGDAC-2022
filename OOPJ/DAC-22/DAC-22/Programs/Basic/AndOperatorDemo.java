class AndOperatorDemo
{
	public static void main(String args[])
	{
		int x = 5;
		int y = 10;

		if(x > y && y++ < 15)
		{
			System.out.println("Hi");
		}
		else
		{
			System.out.println("Bye");
		}

		System.out.println(x);
		System.out.println(y);
	}
}
