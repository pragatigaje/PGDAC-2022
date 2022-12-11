
// case 4 : multiple task from multiple thread
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Task 1 by " + getName());
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Task 2 by " + getName());
	}
}


class MultiCases
{
	public static void main(String args[])
	{
		Thread1 t1 =  new Thread1();
		t1.start();
		
		Thread2 t2 =  new Thread2();
		t2.start();
		
	}
}


/*

// case 2 : single task from multiple thread
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Task 1 by " + getName());
	}
}


class MultiCases
{
	public static void main(String args[])
	{
		Thread1 t1 =  new Thread1();
		t1.start();
		
		Thread1 t2 =  new Thread1();
		t2.start();
		// t1.start();		IllegalThreadStateException
	}
}



/*
// case 1 : single tasl from single thread
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
}

class MultiCases
{
	public static void main(String args[])
	{
		Thread1 t1 =  new Thread1();
		t1.start();
	}
}
*/