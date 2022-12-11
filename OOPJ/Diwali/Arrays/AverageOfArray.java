import java.util.*;

class AverageOfArray
{
	public static void main(String args[])
	{
		int arr[] ={5,14,35,89,140};
		System.out.println(Arrays.toString(arr));
		int avg=0;
		int arr1[]=new int[arr.length-2];
		
		for(int i=0; i<arr.length-2; i++)
		{
			arr1[i]= (arr[i]+arr[i+1]+arr[i+2])/3;
			
		}
		System.out.println(Arrays.toString(arr1));
		
		
	}
}