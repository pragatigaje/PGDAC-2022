class ThreadInterrupt extends Thread
{
	ThreadInterrupt(String name)
	{
		super(name);
	}
	
	public void run()
	{
		try
		{
			//System.out.println(Thread.currentThread().interrupted());
			//System.out.println(Thread.currentThread().interrupted());
			System.out.println("Is Interrupt : "+Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().interrupted());
			System.out.println(Thread.currentThread().interrupted());
			System.out.println("Is Interrupt : "+Thread.currentThread().isInterrupted());
			for(int i =1; i<=5 ; i++)
			{
				System.out.println(i+ " : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}catch(InterruptedException ie) 
		{
			System.out.println("3. Thread Interrupted : "+ie.getMessage());
			System.out.println("4. Thread state : "+Thread.currentThread().isAlive());
			
		}
				
	}
	
	public static void main(String args[]) throws Exception
	{
		ThreadInterrupt t = new ThreadInterrupt("Child Thread");
		t.start();
		t.interrupt();
		t.join();
		System.out.println("1. Thread state : "+t.isAlive()+" "+t.getName());
		System.out.println("2. Thread state : "+Thread.currentThread().isAlive()+" "+Thread.currentThread().getName());
	}
}