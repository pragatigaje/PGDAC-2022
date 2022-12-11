class MyThread implements  Runnable
{
	Thread t;
	MyThread()
	{
	}
	
	MyThread(String name)
	{
		t = new Thread(this);
		t.start();
	}
	
	public void run()
	{
	
		System.out.println(getName()+" started to run");
		
		try
		{
			for (int i =1; i<=5; i++)
			{
				System.out.println(t.getName() + " : "+ i);
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		System.out.println(t.getName()+"  Ended");
	}
}

class MultiThreadingRunnable
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Current thread running is : "+Thread.currentThread().getName());
		MyThread mth1 = new MyThread("Thread 1");
		mth1.t.start();
		
		MyThread mth2 = new MyThread("Thread 2");
		mth2.t.start();
		
		mth1.t.join();
		mth2.t.join();

		System.out.println("Current thread ended is : "+Thread.currentThread().getName());

	}
}