class MyThread extends Thread{
	
	MyThread()
	{
	}
	
	MyThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
	
		System.out.println(getName()+" started to run");
		
		try
		{
			for (int i =1; i<=5; i++)
			{
				System.out.println(this.getName() + " : "+ i);
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		System.out.println(getName()+"  Ended");
	}
}

class MultiThreading
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Current thread running is : "+Thread.currentThread().getName());
		MyThread mth1 = new MyThread("Thread 1");
		mth1.start();
		
		MyThread mth2 = new MyThread("Thread 2");
		mth2.start();
		
		mth1.join();
		mth2.join();

		System.out.println("Current thread ended is : "+Thread.currentThread().getName());

	}
}