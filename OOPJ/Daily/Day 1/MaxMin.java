import java.util.*;

class MaxMin{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	System.out.println("Using Math Function :");
	System.out.println("Max Number : "+Math.max(a,b));
	System.out.println("Max Number : "+Math.min(a,b));
	
	System.out.println("Using if-else :");
	if ((a>b) && (a>c))
	{
		System.out.println("Max = "+a);
	}
	else if ((b>a) && (b>c))
	{
		System.out.println("Max = "+b);
	}
	else 
	{
		System.out.println("Max = "+c);
	}


	}


}