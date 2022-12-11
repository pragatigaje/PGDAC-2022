import java.util.*;
class SingleLinkedListMethods
{
	Node head;
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
			}
			else
			{
				System.out.println("Enter choice for insertig node 1.At start 2.At Last 3.At particular position");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					new_node.next = head;
					head = new_node;
					break; 
					
				case 2:
					Node temp = head;
					while(temp.next!=null)
					{
						temp = temp.next;
					}
					temp.next = new_node;
					break;
					
				case 3:
					System.out.println("Enter position to insert node : ");
					int p = sc.nextInt();
					Node temp1 = head;
					for (int i =0; i<(p-1) ; i++)
					{
						temp1=temp1.next;
					}
					new_node.next = temp1.next;
					temp1.next = new_node;
					break;		
				}
			}
			System.out.print("Do you want to continue ? If yes press: 1");
			n = sc.nextInt();
		}while(n==1);
		
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
				System.out.println("Enter choice for deleting node 1.At start 2.At Last 3.At particular position 4.Delete node with key");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					Node temp = head;
					temp = temp.next;
					head = temp;
					break; 
					
				case 2:
					Node temp2 = head;
					Node ptr = temp2.next;
					while(ptr.next!=null)
					{
						temp2 = ptr;
						ptr=ptr.next;
					}
					temp2.next = null;
					break;
					
				case 3:
					System.out.println("Enter position to delete node : ");
					int p = sc.nextInt();
					Node temp1 = head;
					Node ptr1 = temp1.next;
					for (int i =0; i<(p-2) ; i++)
					{
						temp1=ptr1;
						ptr1=ptr1.next;
					}
					temp1.next=ptr1.next;
					break;	
				
				case 4:
					System.out.println("Enter key to delete node : ");
					Node temp3 = head;
					int key = sc.nextInt();	
					
					
				}
			}
			System.out.print("Do you want to continue ? If yes press: 1");
			n = sc.nextInt();
		}while(n==1);
		
	}
	
	void print()
	{
		Node temp;
		int count=0;
		temp = head;
		if (head == null)
		{
			System.out.println("LL doesnt exist ");
		}
		else
		{
			System.out.println("Node of Linked list are : ");
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
				count++;				
			}
			System.out.println("No of nodes are : "+count);
		}
		System.out.println();
	}
	
	void max()
	{
		Node temp=head;
		int max=0;
		
		while(temp != null)
			{
				if(temp.data>max)
				{
					max=temp.data;
				}
				temp=temp.next;
			}
	}
	
	void()
	
	public static void main(String args[])
	{
		SingleLinkedListMethods list = new SingleLinkedListMethods();
		list.creation();
		list.print();
		list.delete();
		list.print();
		//list.max();
		
	}
}