import java.util.*;

class Stack
{
	int n = 100;
	int top=-1;
	char[] arr = new char[n];
	Scanner sc = new Scanner(System.in);
	
	void push(char c)
	{
		top+=1;
		arr[top]=c;
	}
	
	void pop(char c)
	{
		top-=1;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	boolean isValid(String str)
	{
		char arr[]= str.toCharArray();
		for(char c : arr)
		{
			if(c == '{' || c == '(' || c == '[')
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
					if(c == '}' ||c == ']' || c == ')')
						pop(c);
					else
						return false;
					
				}
			}
		}
		System.out.println(arr);
		return isEmpty();
	}
	
}
class BalancedParanthesis
{
	public static void main(String args[])
	{
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the expression : ");
		String st = sc.next();
		System.out.print("Is the expression valid : "+stack.isValid(st));
		
        
	}
}