import java.util.*;

class MyException extends Exception
{
	 
}
class ExceptionHandling
{
	public static void main(String args[])
	{
		try
		{}
		catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index is invalid");
			}
		catch(ArithmenticException e)
			{
				System.out.println("Invalid division");
			}
		catch(NumberFormatException e)
			{
				System.out.println("Format mismatch");
			}
		catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Index is invalid");
			}
		finally
			{
				System.out.println("Exception Handling Completed");
			}
	
	}
	
}