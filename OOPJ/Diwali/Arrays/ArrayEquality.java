import java.util.*;

//Write a Java program to check the equality of two arrays?

class ArrayEquality
{
	public static void main(String args[])
	{		
		int arr1[] = {10,20,36};
		int arr2[] = {10,20,36};
		int arr3[] = {20,36,10};
		
		
		Arrays.sort(arr3);
		System.out.println("Checking are arr1  and arr2 are equal : "+ Arrays.equals(arr1, arr2));
		System.out.println("Checking are arr1  and arr2 are equal  : "+ Arrays.equals(arr1, arr3));
		System.out.println("Checking are arr2  and arr2 are equal : "+ Arrays.equals(arr2, arr3));
	}
	
}