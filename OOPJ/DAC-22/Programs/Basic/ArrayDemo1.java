import java.util.*;

class ArrayDemo1
{
	public static void main(String args[])
	{
		//int marks[] = {40,65,50,75,80};
		
		int marks[];
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for array");
		size = sc.nextInt();
		
		marks = new int[size];	

		System.out.println("Enter the values for the array");
		for(int i = 0; i < size; i++)
		{
			int val = sc.nextInt();
			marks[i] = val;

		}

		System.out.println("Array elements are : ");
		for (int i = 0; i < marks.length; i++)
		{
			System.out.println(marks[i]);
		}

	}
}
