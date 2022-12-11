class VarArgsDemo
{
	public static void printAll(String str, int... vals)		//int... vals => int []vals;
	{
		System.out.println(str);
		for(int i = 0; i < vals.length; i++)
		{
			System.out.println(vals[i]);
		}

	}

	public static void main(String []args)
	{
		printAll("Hello",2,5,7,9,10,16,25);

		System.out.println("args array elements: ");
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
