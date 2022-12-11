class ThreadJoinDemo2 extends Thread
{
	static Thread main;
	ThreadJoinDemo2(String name)
	{
		super(name);
	}
	
	public void run()
	{
		try
		{
			main.join();
			for(int i =1; i<=5 ; i++)
			{
				System.out.println(i+ " : "+Thread.currentThread().getName());
				Thread.sleep(500);
			}
		}catch(InterruptedException ie) {}
				
	}

	public static void main(String args[])
	{
		
		main = Thread.currentThread();
		ThreadJoinDemo2 t = new ThreadJoinDemo2("Child thread");
		t.start();
		
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
