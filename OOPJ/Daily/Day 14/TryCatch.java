class TryCatch
{
	public static void main(String args[])
	{
		System.out.println("Program started ");
		int arr[]={10,20,30,40,50};
		try 
		{
			System.out.println(10/0);
			//System.out.println(arr[5]);
			System.out.println("After Exception");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program End");
	}
}