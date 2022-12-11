import java.util.*;

class Stack
{
	Scanner sc = new Scanner(System.in);
	int top=-1;
	int n = 10;
	int a[]=new int[n];
	
	void push()
	{
		if(top==n-1)
		{
			System.out.println("Overflow Condition");
		}
		else
		{
			int i = sc.nextInt();
			top+=1;
			a[top]=i;
			System.out.println("Item inserted");
		}
	}
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow Condition");
		}
		else
		{
			top-=1;
			System.out.println("Item deleted");
		}
	}
	
	void displayStack()
	{
		for(int j=top; j>=0; j--)
		{
			System.out.println(a[j]);			
		}
	}
	
	void getTop()
	{
		int x = a[top];
		System.out.println("Elemet at top : "+x);
	}
	
	boolean isEmpty()
	{
		if(top<0)
			return true;
		else 
			return false ;
	}
}

class StackArray
{
	public static void main(String args[])
	{
		Stack s = new Stack();
		Stack s1 = new Stack();
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
					s.push();
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
		
		s.getTop();
		System.out.println("Stack s is empty? = "+s.isEmpty());
		System.out.println("Stack s is empty? = "+s1.isEmpty());
		
		
	}
}