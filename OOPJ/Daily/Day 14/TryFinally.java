class TryFinally
{
	public static void main(String args[])
	{
		System.out.println("Start");  
		try
		{
			System.out.println("try");
			System.exit(5);
		}    

		catch(Exception e)
		{  
			System.out.println("Catch");  
		}    

		finally
		{  
			System.out.println("finally ");  
		}    
		
			System.out.println("End");   
	}
}