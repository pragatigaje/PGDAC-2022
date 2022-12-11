class MyThread extends Thread	//Each object ofd MyThread will be treated as Thread object
{
	MyThread()
	{
	}

	MyThread(String name)
	{
		super(name);
	}

	public void run() 	//starting point of thread.
	{
		System.out.println(this.getName() +" started to run");

		try
		{
			for(int i = 1; i <= 5; i++)
			{
				System.out.println(this.getName() + " : " + i);
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}

		System.out.println(this.getName() +" ended");
	}
}


class MultithreadingUsingThreadDemo
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Main thread started to run");
		MyThread mth1 = new MyThread("Thread1");	//mth1 is a thread object
		mth1.start();			//Now thread started to run and will call corresponding run() method

		MyThread mth2 = new MyThread("Thread2");
		mth2.start();

		mth1.join();	//Main thread will wait here for mth1 to complete its task and join here.
		mth2.join();	//Main thread will wait here for mth2 to complete its task and join here.

		System.out.println("Main thread ended");
	}
}
