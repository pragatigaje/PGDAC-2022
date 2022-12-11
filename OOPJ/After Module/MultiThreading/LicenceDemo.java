class Medical extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Medical Starts");
			Thread.sleep(2000);
			System.out.println("Medical Completed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("TestDrive Starts");
			Thread.sleep(5000);
			System.out.println("TestDrive Completed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("OfficerSign Starts");
			Thread.sleep(3000);
			System.out.println("OfficerSign Completed");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class LicenceDemo
{
	public static void main(String args[]) throws InterruptedException
	{
		Medical medical = new Medical();
		medical.start();
		
		medical.join();
		TestDrive td = new TestDrive();
		td.start();
		
		td.join();
		OfficerSign os = new OfficerSign();
		os.start();
	}
}