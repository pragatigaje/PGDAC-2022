import java.util.Scanner;

class ScannerDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int val = sc.nextInt();
		System.out.println("Entered value is : " + val);
		
		sc.nextLine();

		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Entered name is : " + name);

	}
}
