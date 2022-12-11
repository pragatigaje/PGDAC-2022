import java.util.Scanner;
class Palindrome{
	public static void main (String args []){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num = sc.nextInt();
	int temp,remainder = 0, reverse = 0;
	temp = num;
	for (;temp>0;)
	{
		remainder= temp%10;
		reverse= reverse*10 + remainder;
		temp/=10;
	}
	
	if (num==reverse)
		System.out.println("Yes, It is a palindrome number.");
	else 
		System.out.println("No, It is not a palindrome number.");
	
	}

}