import java.util.*;
class SingleLinkedListCreation
{
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next= null;
		}
	}
	Node head = null;
	
	public void creation()
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
				new_node.next = head;
				head = new_node;
			}
			System.out.print("Do you want to continue ? If yes press: 1");
			n = sc.nextInt();
		}while(n==1);
		
		
	}
	
	public void transverser()
	{
		Node temp=head;
		if (head == null)
		{
			System.out.print("LL Doesnt exist ");
		}
		else
		{
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
		}
	}
	
	public static void main(String args[])
	{
		SingleLinkedListCreation list1 = new SingleLinkedListCreation();
		list1.creation();
		list1.transverser();
	}
	
}