class PrintNumbers
{
	static int print(int n)
	{
		
		if (n == 1)
			return 1;
		else
			return print(n);
	}
	public static void main(String args[])
	{
		for (int i=1 ; i<=5 ; i++)
		{
			System.out.println(print(5));
		}
		
	}
}