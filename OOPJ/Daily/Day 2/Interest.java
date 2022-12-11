import java.util.Scanner;
class Interest{
	
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println ("Principle amount :");
	int p = sc.nextInt();
	System.out.println ("Rate of Interest :");
	double r = sc.nextDouble();
	System.out.println ("Time period in years :");
	int t = sc.nextInt();
	
	double i = (p*r*t)/100;
	
	System.out.println("Simple Interest : Rs. "+i);
	
	System.out.println("Total amount to paid by "+t+" years is Rs. "+(i+p));
}
}