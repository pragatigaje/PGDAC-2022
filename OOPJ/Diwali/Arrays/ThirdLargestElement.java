import java.util.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		int arr[] ={9, 45, 29, 44, 99, 16, 100};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		int max=0;
		for(int i=0; i< arr.length-1; i++)
		{
			for(int j=i+1; i< arr.length; j++)
			{
				if (arr[i]<arr[j])
				{
					max=j;	//max =1
					break;
				}
			}
		}
		System.out.println("1st Largest = "+arr[max]);
		
		for(int i=0; i< arr.length-1; i++)
		{
			for(int j=i+1; i< arr.length; j++)
			{
				if (j==max)
				{
					break;
				}
				else if(arr[i]<arr[j])
					{
						max=j;	//max =1
						break;
					}
			}
		}
		System.out.println("2nd Largest = "+arr[max]);
		
		for(int i=0; i< arr.length-1; i++)
		{
			for(int j=i+1; i< arr.length; j++)
			{
				if (j==max)
				{
					break;
				}
				else if(arr[i]<arr[j])
					{
						max=j;	//max =1
						break;
					}
			}
		}
		System.out.println("3rd Largest = "+arr[max]);
		
		
		
	}
}