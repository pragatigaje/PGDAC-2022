class SumOfNatural
{
	static int sum = 0;
	
	static int sum(int n)
	{
		sum = n;
		if (n <= 1)
			return 1;
		else
			return sum+sum(n-1);
	}
	
	public static void main(String args[])
	{
		System.out.println(sum(50));
	}
}







