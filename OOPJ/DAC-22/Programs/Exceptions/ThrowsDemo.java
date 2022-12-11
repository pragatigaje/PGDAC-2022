import java.io.*;

class ThrowsDemo
{
	public static void myFun() throws IOException, ArithmeticException
	{
		System.out.println("myFun called");
		//int res = 5/0;
	}
	
	public static void main(String args[])
	{
		System.out.println("Program started execution");
		
		//myFun();	//unreported exception IOException; must be caught or declared to be thrown
		
		try
		{
			myFun();
			throw new IOException("File not found");	//compiler will force to handle it.
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception : " +e.getMessage());
		}
		
		
		System.out.println("Program terminated successfully");
		
	}
}

























