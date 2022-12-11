import java.util.*;

//* In this program we are increasing size of array and adding 
// element at new index using for loop with if else
 
class ArrayInsert2
{
	public static void main(String args[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Enter values : ");
		for (i = 0 ; i < size ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		//taking input of index and element from user
		System.out.println("Enter index of new value to be inserted : ");
		int ni = sc.nextInt();
		System.out.println("Enter new value to be inserted : ");
		int nv = sc.nextInt();
		size++;
		
		for (i=0 ; i < size ; i++)	// 10 20 30 40 50
		{							// 10 20 80 30 40 50
			if (i < ni)				// if index is smaller than ni skip
				continue;
			if (i == ni)			//if i = ni then assign nv
				a[i]=nv;
			else 					// now copy values with -1 index
				a[i]=a[i-1];
		}
		
		System.out.println("Array a : ");
		for (i = 0 ; i < size+1 ; i++)
		{
			System.out.println([i]);
		}
	}
}