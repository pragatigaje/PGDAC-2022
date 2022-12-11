class Test extends Thread
{
	Test(String name)
	{
		super(name);
	}
	
	public void run()
	{
		try
		{
			for(int i =1; i<=5 ; i++)
			{
				System.out.println(i+ " : "+Thread.currentThread().getName());
				Thread.sleep(500);
			}
		}catch(InterruptedException ie) {}
				
	}
}

class ThreadPreventExecution3
{
	public static void main(String args[])
	{
		Test t = new Test("Child Thread");
		t.start();
		
		try
		{
			for(int i =1; i<=5 ; i++)
			{
				//t.join();
				System.out.println(i+ " : "+Thread.currentThread().getName());
				Thread.sleep(500);
			}
		}catch(InterruptedException ie) {}
	}
}
