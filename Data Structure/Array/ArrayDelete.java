import java.util.*;

//* In this program we have created new array of size-1 
// and deleted element at user defined index using if else in for loop
 
class ArrayDelete1
{
	public static void main(String args[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		int b[] = new int [size-1];
		
		System.out.println("Enter values : ");
		for (i = 0 ; i < size ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		//taking input of index
		System.out.println("Enter index of new value to be deleted : ");
		int di = sc.nextInt();
		
		for (i=0 ; i < size-1 ; i++)	// 10 20 30 40 50
		{								// 10 20 40 50
			if (i < di)
				b[i]=a[i];
			else if (i == di)
				continue;
			else
				b[i-1]= a[i];
		}
		
		System.out.println("Array a : ");
		for (i = 0 ; i < size-1 ; i++)
		{
			System.out.println(b[i]);
		}
	}
}