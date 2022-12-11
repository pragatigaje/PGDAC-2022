import java.util.*;

class Queue
{
	Scanner sc = new Scanner(System.in);
	int f=-1, r=-1;
	int n = 10;
	int q[]=new int[n];
	
	void enqueue()
	{
		if(r==(n-1))
		{
			System.out.println("Overflow Condition");
		}
		else
		{
			System.out.println("Enter data :");
			int i = sc.nextInt();
			if(f==-1 && r==-1)
			{
				f=r=0;
				q[r]=i;
			}
			else
			{
				r=r+1;
				q[r]=i;
			}
			System.out.println("Item inserted");	
		}
	}
	
	void dequeue()
	{
		if(f==-1 && r==-1)
		{
			System.out.println("Underflow Condition");
		}
		else
		{
			f=f+1;
			System.out.println("Item deleted");
		}
	}
	
	void display()
	{
		System.out.println("Item are : ");
		for(int j=f; j<=r; j++)
		{
			System.out.println(q[j]);			
		}
	}
	
	boolean isEmpty()
	{
		if(f==-1 && r==-1)
			return true;
		else 
			return false ;
	}
}

class QueueUsingArray
{
	public static void main(String args[])
	{
		Queue queue = new Queue();
		Scanner sc = new Scanner(System.in);
		int m;
		do
		{
			System.out.println("Enter no for operation to be performed :");
			System.out.println("1.enqueue 2.dequeue 3.display 4.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					queue.enqueue();
					break;
				case 2:
					queue.dequeue();
					break;
				case 3:
					queue.display();
					break;
				default :
					break;
			}
			System.out.println("Enter 0 to continue :");
			m = sc.nextInt();
		}while(m==0);
		System.out.println("Queue is empty? = "+queue.isEmpty());
	}

	
	
}