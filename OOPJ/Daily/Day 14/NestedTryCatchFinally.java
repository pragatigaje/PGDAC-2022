class NestedTryCatchFinally
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40};
		try
		{
			try
			{
				System.out.println("Inner try block");
				System.out.println(10/0);
			}    
			catch(ArrayIndexOutOfBoundsException e)
			{  
				System.out.println("Inner Catch block");  
			}   
			System.out.println("Outerside of Inner try block");		
		}    
		catch(Exception e)
		{  
			System.out.println("Outer Catch block ");  
		}    
		finally
		{  
			System.out.println("Outer finally block");  
		}    
		System.out.println("End Of Program -------------- ");   
	}
}