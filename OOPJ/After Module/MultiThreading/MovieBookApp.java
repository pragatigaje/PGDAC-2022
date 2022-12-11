class TotalEarnings extends Thread
{
	int total =0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=1 ; i<=10 ; i++)
			{
				total+=100;
			}
			this.notify();
		}
	}
}

class MovieBookApp
{
	public static void main(String args[]) throws Exception
	{
		TotalEarnings te = new TotalEarnings();
		te.start();
		
		synchronized(te)
		{
			te.wait();
			System.out.println("Total earning : "+te.total);
		}	
	}
}
