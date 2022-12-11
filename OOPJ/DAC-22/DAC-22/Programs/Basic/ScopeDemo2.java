class ScopeDemo2
{
	public static void main(String args[])
	{
		int x = 5;

		{
			double x = 10.5;
		}

		System.out.println(x);
	}
}
