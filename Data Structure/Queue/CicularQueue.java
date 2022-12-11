import java.util.*;

class Queue
{
	int f=-1;
	int r=-1;
	int n=10;
	int q[]=new int[n];
		
	void enqueue(Scanner sc)
	{
		if(f==(r+1)%n)
		{
			System.out.println("Overflow Condition");
		}
		else
		{
			System.out.println("Enter data :");
			int i = sc.nextInt();
			
			if(f==-1 && r==-1)
			{
				f=0;
				r=0;
				q[r]=i;
			}
			else
			{
				r=(r+1)%n;
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
		else if (f==r)
		{
			f=r=-1;
			System.out.println("Underflow Condition");
		}
		else
		{
			f=(f+1)%n;
			System.out.println("Item deleted");
		}
	}
	
	void display()
	{
		int k;
		System.out.println("----------- Item are : --------------");
		for( k=f; k!=r;k= (k+1)%n)
		{
			System.out.println(q[k]);			
		}
		System.out.println(q[k]);
	}
	
}

class CicularQueue
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
					queue.enqueue(sc);
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
		//System.out.println("Queue is empty? = "+queue.isEmpty());
	}	
}