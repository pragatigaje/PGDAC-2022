import java.util.*;

class StackLL
{
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
	Node top=null;
	
	void push(Scanner sc)
	{
		System.out.println("Enter node : ");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		if(top==null)
		{
			top=new_node;
			System.out.println(data+" pushed to stack");
		}
		else
		{
			new_node.next = top;
			top = new_node;
			System.out.println(data+" pushed to stack");
		}
	}
	

	void pop()
	{
		if(top==null)
		{
			System.out.println("Underflow Condition : stack is empty");
		}
		else
		{
			top=top.next;
			System.out.println(top.data+" popped to stack");
		}
	}
	
	void displayStack()
	{
		System.out.println("----- Elemets of stack -----");
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("----------------------------");
	}
	
}

class StackAsLinkedList
{
	public static void main(String args[])
	{
		StackLL s = new StackLL();
		Scanner sc = new Scanner(System.in);
		int m;
		do
		{
			System.out.println("Enter no for operation to be performed :");
			System.out.println("1.push 2.pop 3.display 4.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					s.push(sc);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.displayStack();
					break;
				default :
					break;
			}
			System.out.println("Enter 0 to continue :");
			m = sc.nextInt();
		}while(m==0);
	}
}

