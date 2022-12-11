class MyException extends Exception		//Checked exception
{
	//String excpMsg;
	
	public MyException()
	{
		super("Default exception message");
		//excpMsg = "My exception message";
	}
	
	public MyException(String msg)
	{
		super(msg);
		//excpMsg = msg;
	}
	
	/*public String getMessage()
	{
		return excpMsg;
	}*/
}

class UserDefinedExceptionDemo
{
	public static void main(String args[])
	{
		System.out.println("Program execution started");
		try
		{
			throw new MyException();
			//throw new MyException("This is an exception generate by the user");
		}
		catch(MyException e)
		{
			System.out.println("MyException : "+e.getMessage());
		}
		
		System.out.println("Program terminated successfully");
	}
}
