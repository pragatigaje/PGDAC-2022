class Multi implements Runnable
{
	Multi()
	{}
	
	Multi(String name)
	{
		t = new Thread(this);
		super(name);
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Started ....");
	}
	
	public static void main(String args[])
	{
		Multi t = new Multi("Thread by Pragati");
		Thread th = new Thread(t);
		th.start();

	}
}




/*class Multi extends Thread
{
	Multi()
	{}
	
	Multi(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(getName() + " Started ....");
	}
	
	public static void main(String args[])
	{
		Multi t = new Multi("By Pragati");
		t.start();
	}
}*/