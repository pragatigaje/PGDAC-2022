class StringPrinter
{
	public void print(String str)
	{
		try
		{
			System.out.print("[");
			Thread.sleep(500);
			System.out.print(str);
			Thread.sleep(500);
			System.out.println("]");
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}

class MyThread implements Runnable
{
        Thread t;
        StringPrinter sp;
        String strToPrint;

        MyThread(String name,StringPrinter sp,String strToPrint)
        {
                t = new Thread(this,name);
                this.sp = sp;
                this.strToPrint = strToPrint;
                t.start();
        }

        public void run()
        {
                sp.print(strToPrint);
        }
}

class NonSynchronizationDemo
{
        public static void main(String args[]) throws InterruptedException
        {
		StringPrinter sp = new StringPrinter();

                MyThread mth1 = new MyThread("Thread1",sp,"Hello");
                MyThread mth2 = new MyThread("Thread2",sp,"Friends");
                MyThread mth3 = new MyThread("Thread3",sp,"Welcome");

		mth1.t.join();
		mth2.t.join();
		mth3.t.join();

        }
}

