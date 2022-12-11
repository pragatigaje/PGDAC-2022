import java.util.*;

class LinkedListDemo
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
	
	void create(Scanner sc)
	{
		System.out.println("Enter size of linked list");
		int size = sc.nextInt();
		int count = 0 ;
		
		do{
			System.out.println("Enter data : ");
			int data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null)
			{
				head =new_node;
			}
			else
			{
				Node temp = head;
					while(temp.next!=null)
					{
						temp = temp.next;
					}
					temp.next = new_node;
			}
			count++;
		}while(count<size);
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
				System.out.print(temp.data+" -> ");
				temp=temp.next;
				count++;				
			}
			System.out.println(" Null");
			System.out.println("No of nodes are : "+count);
		}
		System.out.println();
	}
	
	Node reverse()
	{
		Node prev = null;
		Node current =head;
		Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
		
	}
	
	void getValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position : ");
		int p = sc.nextInt();
		Node temp = head;
		for(int i=1 ; i<p; i++)
			{
				temp=temp.next;
			}
			System.out.println("Value at "+p+ " is "+temp.data);		
	}
	
	void getValueRev()
	{
		reverse();
		getValue();
		reverse();
	}
	
	public static void main(String args[])
	{
		LinkedListDemo list = new LinkedListDemo();
		Scanner sc = new Scanner(System.in);
		
		list.create(sc);
		list.print();
		// list.reverse();
		// list.print();
		list.getValue();
		list.getValueRev();
		list.getValueRev();
		
		
	}
}