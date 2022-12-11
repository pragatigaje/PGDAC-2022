import java.util.*;
class CircularSingleLinkedList
{
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head = null;
	Node tail = null;
	
	public void create()
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
				tail = new_node;
				new_node.next=head;
			}
			else
			{	
				System.out.println("Enter choice for insertig node 1.At start 2.At Last 3.At particular position");
				int choice = sc.nextInt();	
				switch(choice)
				{
					case 1:
						new_node.next = head;
						tail=new_node;
						tail.next=head;
						break;
						
					case 2:
						tail.next=new_node;
						tail=new_node;
						tail.next=head;
						break;
						
					case 3:
						System.out.println("Enter position to insert node : ");
						int p = sc.nextInt();
						Node temp = head;
						for(int i=1; i< (p-1); i++)
						{
							temp=temp.next;
						}
						new_node.next=temp.next;
						temp.next=new_node;
						
						break;
						
					default:
						break;
				}				
				
			}
			System.out.println("Do you want to continue ? If yes press: 1");
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
				System.out.println("Enter choice for deleting node 1.At start 2.At Last 3.At particular position");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					Node temp = head;
					temp = temp.next;
					head = temp;
					tail.next = head; 
					break; 
					
				case 2:
					Node temp1 = head;
					Node ptr1 = temp1.next;
					while(ptr1.next != head)
					{
						temp1=ptr1;
						ptr1 = ptr1.next;
					}
					temp1.next = head;
					tail=temp1;
					break;
					
				case 3:
					System.out.println("Enter position to delete node : ");
					int p = sc.nextInt();
					Node temp2 = head;
					Node ptr2 = temp2.next;
					for(int i=1; i<(p-1) ; i++)
					{
						temp2=ptr2;
						ptr2=ptr2.next;
					}
					temp2.next=ptr2.next;
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
			System.out.println("Elemets are ==> ");
			do
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp.next!=head);
		}
		System.out.println();	
		
	}
	
	public static void main(String[] args)
	{
		CircularSingleLinkedList list = new CircularSingleLinkedList();
		list.create();
		list.print();
		list.delete();
		list.print();
	}
}