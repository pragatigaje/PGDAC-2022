import java.util.*;
//Write a Java program to find all pairs of elements in an integer 
//array whose sum is equal to a given number?

class PairOfSum
{
	public static void main(String args[])
	{
		int arr[] ={10, 5, 9, 4, 7, 6, 11};
		int sum  = 15;
		boolean flag = false;
		System.out.println(Arrays.toString(arr));
		System.out.println("Pairs of sum ");
		
		
			/*for(int i =0; i<arr.length-1; i++)
			{
				if(arr[i]+arr[i+1]== sum)
				{
					System.out.println("[ "+arr[i]+" , "+arr[i+1]+" ]");
				}
			}*/
			
			for (int i =0; i<arr.length; i++)
			{ 
				for(int j=i+1; j<arr.length; j++)
				{
					if((arr[i]+arr[j]) == sum)
					{
						System.out.println("[ "+arr[i]+" , "+arr[j]+" ]");
					}
				}
			}
	}
}