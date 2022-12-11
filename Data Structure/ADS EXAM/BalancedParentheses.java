import java.util.*;

class Stack 
{
	int size=100;
	int top=-1;
	char[] arr = new char[size];
	Scanner sc = new Scanner(System.in);
	
	void push(char c)
	{
		top=top+1;
		arr[top]=c;
	}
	
	void pop(char c)
	{
		top=top-1;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	boolean isBalanced(String str)
	{
		char[] arr = str.toCharArray();
		for(char c : arr)
		{
			if(c == '(')
			{
				push(c);
			}
			else
			{
				if(isEmpty())
				{
					return false;
				}
				else
				{
					char t = arr[top];
					if (c == ')')
						pop(c);
					else
						return false;
				}
			}
		}
		return isEmpty();
	}
	
}
class BalancedParentheses
{
	
	
	public static void main(String args[])
	{
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String expression :");
		String str = sc.next();
		System.out.println(stack.isBalanced(str));
		
	}
}