import java.util.*;

class LinkedListDemo
{
	Node head = null;
	Node slow_ptr, fast_ptr, second_half;
	static class Node
	{
		int data;
		Node next;
		
		Node()
		{
			Node next=null;
		}
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	void create(Scanner sc)
	{
		int data,m;
		do
		{
			System.out.println("Enter data : ");
			data=sc.nextInt();
			Node new_node = new Node(data);
			if(head == null)
			{
				head=new_node;
			}
			else
			{
				Node temp = head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=new_node;
			}
			System.out.println("Enter 0 to add more data :");
			m = sc.nextInt();
		}while(m==0);
	}
	
	Node reverse()
	{
		Node prev = null;
		Node next = null;
		Node current = head;
		while(current != null)
		{
			 next=current.next;
			 current.next=prev;
			 prev = current;
			 current= next;
		}
		head=prev;
		return head;
		
	}
	
	void eliminateDuplicates()
	{
		Node temp1=head;
		Node temp2 = null;
						
		while(temp1 != null && temp1.next != null)
		{
			temp2=temp1;
			while(temp2.next != null)
			{
				if(temp1.data==temp2.next.data)
				{
					temp2.next= temp2.next.next;
				}
				else
				{
					temp2= temp2.next;
				}
			}
			temp2 = temp2.next;
		}
	}
	
	boolean isPalindrome()
	{
		slow_ptr= head;
		fast_ptr= head;
		Node prev_slow = head;
		Node mid = null;
		
		boolean result = true;
		
		if(head != null && head.next!=null)
		{
			while(fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr = fast_ptr.next.next;
				prev_slow = slow_ptr;
				slow_ptr = slow_ptr.next;
			}
		
			if(fast_ptr != null)
			{
				mid = slow_ptr;
				slow_ptr=slow_ptr.next;
			}
			second_half  = slow_ptr;
			prev_slow.next = null;
			
			reverse();
			result= compare(head,second_half);
			reverse();
			
			if(mid !=null)
			{
				prev_slow.next=mid;
				mid.next=second_half;
			}
			else
				prev_slow.next = second_half;
			}
			return result;
		
	}
	
	boolean compare(Node head1, Node head2)
	{
		Node temp_1 = head1;
		Node temp_2 = head2;
		while(temp_1 != null && temp_2 != null)
		{
			if(temp_1.data == temp_2.data)
			{
				temp_1= temp_1.next;
				temp_2= temp_2.next;
			}
			else 
			return false;
		}
		
		if(temp_1 == null && temp_2 == null)
			return true;
		return false;
			
	}
	
	void print()
	{
		Node temp=head;
		if(head == null)
		{
			System.out.println("LinkedList doesnt exits ");
		}
		else
		{
			while(temp != null)
			{
				System.out.print(temp.data+" ->");
				temp=temp.next;
			}
			System.out.print(" Null");
			System.out.println();
		}	
	}

	
	
	public static void main(String args[])
	{
		LinkedListDemo list = new LinkedListDemo();
		Scanner sc = new Scanner(System.in);
		int m;
		do
		{
			System.out.println("Enter choice for Operation : ");
			System.out.println("1.Create 2.Reverse 3.Eliminate Duplicates 4.Check Palindrome ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					list.create(sc);
					System.out.println("Linked list :");
					list.print();
					break;
				case 2:
					list.reverse();
					System.out.println("Reversed Linked list :");
					list.print();
					list.reverse();
					break;
				case 3:
					list.eliminateDuplicates();
					list.print();
					break;
				case 4:
					System.out.println("Is Linked list Palindrome :" +list.isPalindrome());
					break;
				default:
					break;
			}
			System.out.println("Enter 0 to go back to the Menu  :");
			m = sc.nextInt();
		}while(m==0);
	}
}