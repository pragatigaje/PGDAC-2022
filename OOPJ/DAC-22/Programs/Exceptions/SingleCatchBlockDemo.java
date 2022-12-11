class SingleCatchBlockDemo
{
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		int a = 10;
		int b = 2;		//change value of b to 0
		int res = 0;
		
		int arr[] = {5,10,15,20,25};
		
		try
		{		
			res = a/b;			//It may cause ArithmeticException
			System.out.println(arr[5]);	//It may cause ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | Exception e)
		{
			System.out.println("Arithmetic exception/ArrayIndexOutOfBoundsException caught here : "+e.getMessage());
		}
		finally
		{
			System.out.println("finally outer");
		}
		
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}
}

