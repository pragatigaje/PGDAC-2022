class LiteralsDemo1
{
	public static void main(String args[])
	{
		//float num = 25.3;		//incompatible types: possible lossy conversion from double to float
		//double num = 25.3;		//solution-1
		float num = 25.3f;		//solution-2
		System.out.println(num);

		long num2 = 2300000000;
		System.out.println(num2);
	}
}
