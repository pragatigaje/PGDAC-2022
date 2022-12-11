import java.util.*;

class ArrayLinearSearch
{
	static int findKey(int key, int a[])
	{
		int count =0;
		for (int i=0; i<a.length ; i++)
		{
			if (key == a[i])
			return i;
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int i, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int a[] = new int [size];
				
		System.out.println("Enter values : ");
		for (i = 0 ; i < size ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter element to be search: ");
		int key = sc.nextInt();
		int res = findKey(key, a);
		if (res > 0)
			System.out.println("Key element "+key+" foumd at index "+res);
		else
			System.out.println("Key element "+key+" NOT foumd");
		
		
		/*
		for (i=0; i<a.length ; i++)
		{
			if (key == a[i])
			{
				c++;
				break;
			}
			else
				continue;
				
		}
		if (c>0)
			System.out.println("Key element "+key+" foumd at index "+i);
		else 
			System.out.println("Key element "+key+" NOT foumd");
		*/
		
		
	}
}