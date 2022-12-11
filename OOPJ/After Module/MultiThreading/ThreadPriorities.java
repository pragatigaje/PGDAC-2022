class Test extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Child Thread");
		System.out.println("Child thread priority : "+Thread.currentThread().getPriority());
	}
}

class ThreadPriorities
{
	public static void main(String args[])
	{
		System.out.println("Main thread old priority : "+Thread.currentThread().getPriority());
		// Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Main thread new priority : "+Thread.currentThread().getPriority());
		
		Test t1 =  new Test();		//Thread-0
		t1.start();
		
		
	}
}
