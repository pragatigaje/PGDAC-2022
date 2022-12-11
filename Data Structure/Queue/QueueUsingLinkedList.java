import java.util.*;

class QueueUsingLinkedList
{
	Node f=null ,r=null;;
	static class Node
	{
		int data;
		Node next;
				
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	void enqueue(Scanner sc)
	{
		System.out.println("Enter node : ");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		
		if(f == null)
		{
			f=new_node;
			r=new_node;
		}
		else
		{
			r.next= new_node;
			r=new_node;	
		}
		System.out.println("Item inserted");
	}
	
	void dequeue()
	{
		if(f==null)
		{
			System.out.println("Underflow Condition");
		}
		else
		{
			f=f.next;
			System.out.println("Item deleted");
		}
	}
	
	void display()
	{
		System.out.println("Item are : ");
		Node temp=f;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	boolean isEmpty()
	{
		if(f==null && r==null)
			return true;
		else 
			return false ;
	}
	
	public static void main(String args[])
	{
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
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
		System.out.println("Queue is empty? = "+queue.isEmpty());
	}
}