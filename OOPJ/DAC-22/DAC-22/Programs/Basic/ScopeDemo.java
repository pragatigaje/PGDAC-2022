class ScopeDemo
{
	public static void main(String args[])
	{
		int x = 5;

		{
			int y = 10;
			x = 20;
		}

		System.out.println(x);
		//System.out.println(y);			// will give compilation error
	}
}
