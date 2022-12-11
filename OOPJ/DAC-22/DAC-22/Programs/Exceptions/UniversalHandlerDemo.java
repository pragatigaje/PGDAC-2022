class UniversalHandlerDemo
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
		catch(Exception e)		//catch-all exception handler / universal exception handler
		{
			System.out.println("Exception caught here: ");
			System.out.println(e.getMessage());	
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}
}





















