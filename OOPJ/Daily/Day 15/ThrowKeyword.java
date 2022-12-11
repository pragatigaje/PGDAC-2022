import java.io.*;
class M
{
	void method()throws IOException
	{
		throw new IOException("DEVICE ERROR 1");
	}
}

class ThrowKeyword
{
	public static void main(String args[])
	{
		try
		{
			M m = new M();
			m.method();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handle 1 :"+e.getMessage());
		}
		
		
		System.out.println("normal flow...");  
	}
}