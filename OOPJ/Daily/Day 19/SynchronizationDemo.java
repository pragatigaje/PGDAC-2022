class StringPrint
{
	synchronized void print(String str)
	{
		try 
		{
			System.out.print("[ ");
			Thread.sleep(500);
			System.out.print(str);
			Thread.sleep(500);
			System.out.println(" ]");
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
	}
}

class MyThread implements  Runnable
{
	Thread t;
	StringPrint sp;
	String strToPrint;
	
	MyThread()
	{
	}
	
	MyThread(String name, StringPrint sp,String strToPrint)
	{
		t = new Thread(this);
		this.sp = sp;
		this.strToPrint= strToPrint;
		t.start();
	}
	
	public void run()
	{
		sp.print(strToPrint);
	}
	
}

class SynchronizationDemo
{
	public static void main(String args[]) throws InterruptedException
	{
		StringPrint sp = new StringPrint();
		
		MyThread mth1 = new MyThread("Thread 1", sp, "Hello");
		MyThread mth2 = new MyThread("Thread 2", sp, " Friends ");
		MyThread mth3 = new MyThread("Thread 3", sp, " Chaaii Piloo!!! ");
		
		mth1.t.join();
		mth2.t.join();
		mth3.t.join();
		mth1.t.join();
		mth2.t.join();
		mth3.t.join();
	}
}