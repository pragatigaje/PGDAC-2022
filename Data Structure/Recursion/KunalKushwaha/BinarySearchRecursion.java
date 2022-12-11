import java.util.*;

class BinarySearchRecursion
{
	static int search(int arr[], int key,  int beg, int end)
	{
		if (beg > end)
		{
			return -1;
		}
		
		int mid = (beg+end)/2;
		
		if(arr[mid] == key)
		{
			return mid;
		}
		
		if (key < arr[mid])
		{
			return search(arr, key, beg, mid-1);
		}
			return search(arr, key, mid+1, end);		
	}
	
	public static void main(String args[])
	{
		int arr[]={12,14,15,32,45,56,78};
		Arrays.sort(arr);
		
		int key=45;
		System.out.println(search(arr,key,0,arr.length-1));
	}
}
