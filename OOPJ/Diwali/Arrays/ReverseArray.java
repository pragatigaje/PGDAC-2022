//Write a program to reverse an Array in java .
import java.util.*;

class ReverseArray
{
	public static void main(String args[])
	{
		int arr[] ={10, 5, 9, 4, 7, 6, 11};
		System.out.println(Arrays.toString(arr));

		int size = arr.length;
		int[] temp= new int[size];
		int j=0;
		
		for(int i=size-1; i>=0 ; i--)
		{
			temp[j]=arr[i];
			j++;
		}
		
		System.out.println(Arrays.toString(temp));
	}
}