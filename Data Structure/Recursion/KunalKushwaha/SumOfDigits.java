class SumOfDigits
{
	static int product(int n)
	{
		if(n==0)
			return 0;
		else
			return (n%10)*product(n/10);
	}
	public static void main(String args[])
	{
		 System.out.println(product(1342));
	}
}