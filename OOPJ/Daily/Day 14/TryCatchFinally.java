class TryCatchFinally
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40};
		try
		{
			System.out.println("in try");
			System.out.println(arr[2]);
			System.out.println("try out");
			
		}    

		catch(Exception e)
		{  
			System.out.println("Catch");  
		}    

		finally
		{  
			System.out.println("finally ");  
		}    
		
			System.out.println(arr[5]);   
	}
}