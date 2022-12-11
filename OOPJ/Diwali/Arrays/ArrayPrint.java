import java.util.Scanner;

//Write a program to print elements of Array ?

class ArrayPrint
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements of array of size "+ size);
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Element at index "+i+ " is " +arr[i]);
		}
	}
	
}