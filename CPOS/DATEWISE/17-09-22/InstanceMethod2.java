import java.util.Scanner;
public class InstanceMethod2{

	void add()
	{
		int i,j;
		i=4;
		j=6;
		System.out.println("Add = " +(i+j));
	}
	
	void addition(int x, int y)
	{
		int a=x;
		int b=y;
		System.out.println("Addition = "+(a+b));
	}
	
	int multiply (int p, int q)
	{
		int m = p*q;
		return m;
	}

	public static void main(String args[]){
		
		// Scanner sc = new Scanner(System.in);

		//System.out.println("Enter the string to pass");
		//String s = sc.next();
		
		InstanceMethod2 p1 = new InstanceMethod2();
		InstanceMethod2 p2 = new InstanceMethod2();
		
		p1.add();
		p1.addition(5,6);
		int res = p1.multiply(5,6);
		System.out.println("Multiplication = "+res);
		
		
		
		//i1.sayHello("Good Morning !!!");
		
	}
 

}