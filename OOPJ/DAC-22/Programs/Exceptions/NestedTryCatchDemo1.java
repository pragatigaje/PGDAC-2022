class NestedTryCatchDemo1
{

	public static void myFun()
	{
		int arr[] = {5,10,15,20,25};
		try
		{
			System.out.println(arr[5]);	//It may cause ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException in inner catch caught");
		}
		finally
		{
			System.out.println("finally inner");
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		int a = 10;
		int b = 2;		//change value of b to 0
		int res = 0;
		
		try
		{		
			res = a/b;			//It may cause ArithmeticException
			myFun();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception caught here: ");
		}
		catch(Exception e)		//error: exception ArithmeticException has already been caught
		{
			System.out.println("Exception caught here: ");
		}
		finally
		{
			System.out.println("finally outer");
		}
		
		System.out.println("result = " + res);
		System.out.println("Program executed successfully");
	}
}

