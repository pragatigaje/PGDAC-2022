class ExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program started ");
		
		try 
		{
			System.out.println(10/0);
			System.out.println("After Exception");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("-----------------------------------------");
			e.printStackTrace();
			System.out.println("-----------------------------------------");
			System.out.println(e);
			System.out.println("-----------------------------------------");
			System.out.println(e.toString());
			System.out.println("-----------------------------------------");
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			
		}
		
		System.out.println("Program End");
	}
}