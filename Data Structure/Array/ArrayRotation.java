import java.util.*;

class ArrayRotation
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		int d=2;
		int k=0;
		int n =arr.length;
		int temp[]= new int[n];
		
		for(int i=d; i<arr.length; i++)
		{
			temp[k]=arr[i];
			k++;
		}
		
		for(int i=0; i<d; i++)
		{
			temp[k]=arr[i];
			k++;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
				
	}
}