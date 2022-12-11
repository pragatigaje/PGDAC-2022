import java.util.*;
class Swap{
	public static void main (String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter Second number: ");
	int n2 = sc.nextInt();
	
	System.out.println("Before : a = "+n1+" b = "+n2);
	n1 = n1+n2;
	n2 = n1-n2;
	n1 = n1-n2;
	System.out.println("After : a = "+n1+" b = "+n2);
	
		
	}

}