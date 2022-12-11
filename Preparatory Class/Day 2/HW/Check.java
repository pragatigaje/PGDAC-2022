import java.util.Scanner;

class Check{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int i = sc.nextInt();
	if ( i%2 == 0)
		System.out.println("Entered number "+i+" is EVEN");
	else 
		System.out.println("Entered number "+i+" is ODD");
	}

}