import java.util.Scanner;
class Reverse{
	public static void main (String args []){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num = sc.nextInt();
	int remainder = 0, reverse = 0;
	
	while (num>0)
	{
		remainder = num%10;
		reverse = reverse*10 + remainder;
		num/=10;
		
	}		
	
	System.out.print("The reverse number is : "+reverse);
	
	
	
	/*
	while (num>0)
	{
		int i= (num%10);
		System.out.print(i);
		num/=10;
	}*/
	
	}

}