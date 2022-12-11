//Find out smallest and largest number in a given Array?

import java.util.*;

class SmallestLargestArray
{
	public static void main(String args[])
	{
		int arr[] ={99, 45, 29, 44, 27, 16, 11};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Largest element :"+arr[0]);
		System.out.println("Smallest element :"+arr[arr.length-1]);
		
	}
}