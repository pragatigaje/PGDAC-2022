class Thread1 extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Thread by Pragati");
		System.out.println("Task 1 by " + getName());
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadMethods
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		Thread1 t1 =  new Thread1();		//Thread-0
		t1.start();
		
		// Thread2 t2 =  new Thread2();		//Thread-1
		//  t2.start();
		System.out.println(Thread.currentThread().isAlive());
		
	}
}
