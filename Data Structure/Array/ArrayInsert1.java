import java.util.*;

//* In this program we have created new array of size+1 
// and inserted element at user defined index using if else in for loop
 
class ArrayInsert1
{
	public static void main(String args[])
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		int b[] = new int [size+1];
		
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
		
		// using loop to insert element at index ni 
		for (i = 0; i < size+1 ; i++)	// 10 20 30 40 50
		{								// 10 20 80 30 40 50
			if (i < ni)					// copying element upto ni from arr a to arr b
				b[i] = a[i];
			else if (i == ni)			
				b[i] = nv;				// assigning nv at ni
			else
				b[i] = a[i-1];			// copying values from arr a by -1 index to arr b
			
		}
	
		System.out.println("Array a : ");
		for (i = 0 ; i < size+1 ; i++)
		{
			System.out.println(b[i]);
		}
	}
}