import java.util.*;

class ArrayBinarySearch
{
	
	public static void main(String args[])
	{
		int i, mid=0, beg = 0 , end , count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int a[] = new int [size];
				
		System.out.println("Enter values : ");
		for (i = 0 ; i < size ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("Sorted array :");
		for (int x : a)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("Enter element to be search: ");
		int key = sc.nextInt();
		
		end = size-1;
		while(beg <= end)
		{
			mid = (beg+end)/2;
			if (key == a[mid])
			{
				count++;
				break;
			}
			else if (key > a[mid])
			{
				beg = mid+1;
			}
			else if (key < a[mid])
			{
				end = mid-1;
			}		
		}
		if (count > 0)
			System.out.println("Key element "+key+" foumd at index "+mid);
		else
			System.out.println("Key element "+key+" not foumd ");
		
	}
}