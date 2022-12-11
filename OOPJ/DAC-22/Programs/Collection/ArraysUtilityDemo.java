import java.util.*;
class ArraysUtilityDemo
{
	public static void main(String args[])
	{
		//int arr[] = {5,10,15,20,25};
		int myarr[] = new int[]{15,10,5,20,2};

		//Arrays.fill(arr,1);

		/*for(int a : myarr)
		{
			System.out.println(a);
		}*/

		//toString() method
		String s = Arrays.toString(myarr);	//String representation of the passed array
		System.out.println(s);

		Arrays.sort(myarr);
		System.out.println("Array elements after sorting: ");
		System.out.println(Arrays.toString(myarr));
	}
}
