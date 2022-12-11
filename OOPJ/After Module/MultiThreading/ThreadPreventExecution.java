class Thread1 extends Thread
{
	public void run()
	{
		//sleep() for thread
		for(int i =1; i<=5 ; i++)
		{
			try
			{
				Thread.sleep(-1);
				System.out.println(i);
			}catch (InterruptedException ie)
			{}
		}
		
	}
}

class ThreadPreventExecution
{
	public static void main(String args[])
	{
		Thread1 t = new Thread1();
		
		//sleep() for main method
		for(int i =1; i<=5 ; i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.print("* ");
			}catch (InterruptedException ie)
			{}
		}
		
		t.start();
	}
}
