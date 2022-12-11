class Q
{
	int prodno;
	boolean produced;

	synchronized void put(int no)
	{
		try
		{
		if(produced == true)
			wait();

		prodno = no;
		System.out.println("Produced : " + prodno);
		produced = true;
		notify();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

	synchronized void get()
	{
		try
		{
		if(produced == false)
			wait();

		System.out.println("Consumed : " + prodno);
		produced = false;
		notify();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}

	}
}

class Producer implements Runnable
{
	Thread t;
	Q q;

	Producer(String name,Q q)
	{
		t = new Thread(this,name);
		this.q = q;
	}

	public void run()
	{
		this.produce();
	}

	public void produce()
	{
		for(int i = 1; i <= 1000; i++)
		{
			q.put(i);
		}
	}
}

class Consumer implements Runnable
{
	Thread t;
	Q q;

	Consumer(String name, Q q)
	{
		t = new Thread(this,name);
		this.q = q;
	}

	public void run()
	{
		this.consume();
	}

	public void consume()
	{
		for(int i = 1; i <= 1000; i++)
		{
			q.get();
		}
	}
}

class ProducerConsumerSynchronizedDemo
{
	public static void main(String []args) throws InterruptedException
	{
		Q q = new Q();
		Producer prod = new Producer("producer",q);
		Consumer cons = new Consumer("consumer",q);

		prod.t.start();
		cons.t.start();

		prod.t.join();
		cons.t.join();
	}
}

