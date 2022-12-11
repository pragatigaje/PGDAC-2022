import java.util.*;
class VoterAgeVerification //extends RuntimeException
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age>18)
			System.out.println("You are eligible for voting");
		else 
			throw new RuntimeException("Age less than required age");
		
		
	}
}