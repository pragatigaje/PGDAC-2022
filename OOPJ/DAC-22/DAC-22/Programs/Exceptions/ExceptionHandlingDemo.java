class ExceptionHandlingDemo
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
			System.out.println(arr[4]);	//It may cause ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught here: ");
			System.out.println(e.getMessage());	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught here"+e.getMessage());
		}
		finally
		{
			System.out.println("finally block");
		}
		
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}
}





















