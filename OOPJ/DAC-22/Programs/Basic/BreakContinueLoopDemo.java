class BreakContinueLoopDemo
{
	public static void main(String args[])
	{
		outer: for (int i = 1; i <= 5; i++)
		{
			inner: for (int j = 1; j <= 5; j++)
			{
				System.out.println (i + "," + j);
				if (i == j)
				{
					break;
				}
			}
			System.out.println("Out of inner for loop");
		}
		System.out.println("Out of outer for loop");
	}
}
