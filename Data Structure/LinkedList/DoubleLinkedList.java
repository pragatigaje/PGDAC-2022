import java.util.*;
class DoubleLinkedList
{
	Node head;
	Node tail;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	void creation()
	{
		int data,n;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter data : ");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null)
			{
				head =new_node;
				tail=new_node;
			}
			else
			{
				System.out.println("Enter choice for insertig node 1.At start 2.At Last 3.At particular position");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					new_node.next = head;
					head.prev=new_node;
					head = new_node;
					break; 
					
				case 2:
					tail.next=new_node;
					new_node.prev =tail;
					tail = new_node;
					break;
					
				case 3:
					System.out.println("Enter position to insert node : ");
					int p = sc.nextInt();
					Node temp=head;
					Node ptr= temp.next;
					for(int i=1; i<(p-1); i++)
					{
						temp=ptr;
						ptr=ptr.next;
					}
					new_node.prev=temp;
					new_node.next=ptr;
					temp.next=new_node;
					ptr.prev=new_node;
					break;		
				}
			}
			System.out.print("Do you want to continue ? If yes press: 1");
			n = sc.nextInt();
		}while(n==1);
	}
	
	public void print()
	{
		Node temp;
		temp = head;
		if (head == null)
		{
			System.out.println("LL doesnt exist ");
		}
		else
		{
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		System.out.println();	
		
	}
	
	void delete()
	{
		int data,n;
		Scanner sc = new Scanner(System.in);
		do
		{
			if (head == null)
			{
				System.out.println("LL doesnt exist ");
			}
			else
			{
				System.out.println("Enter choice for deleting node 1.At start 2.At Last 3.At particular position");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					Node temp = head;
					temp = temp.next;
					head = temp;
					head.prev = null;
					break; 
					
				case 2:
					Node temp2 = tail;
					temp2 = temp2.prev;
					temp2.next=null;
					break;
					
				case 3:
					System.out.println("Enter position to delete node : ");
					int p = sc.nextInt();
					Node temp1 = head;
					Node ptr1 = temp1.next;
					for (int i =1; i<(p-1) ; i++)
					{
						temp1=ptr1;
						ptr1=ptr1.next;
					}
					temp1.next=ptr1.next;
					ptr1.next.prev=temp1;
					break;		
				}
			}
			System.out.print("Do you want to continue ? If yes press: 1");
			n = sc.nextInt();
		}while(n==1);
		
	}
	
	public static void main(String args[])
	{
		DoubleLinkedList list = new DoubleLinkedList();
		list.creation();
		list.print();
		list.delete();
		list.print();
	}
}