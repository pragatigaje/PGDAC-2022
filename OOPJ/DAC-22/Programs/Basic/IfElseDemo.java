class IfElseDemo
{
	public static void main(String args[])
	{
		int x = 5;
		int y = 10;
		int z = 15;

		if(x > y && x > z)
		{
			System.out.println ("x is greater");
		}
		else if(y > z)
		{
			System.out.println("y is greater");
		}
		else
		{
			System.out.println("z is greater");
		}
	}
}
