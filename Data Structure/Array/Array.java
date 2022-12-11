import java.util.*;

class Array
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
		
		//inserting element
		System.out.println("Enter index of new value to be inserted : ");
		int ni = sc.nextInt();
		System.out.println("Enter new value to be inserted : ");
		int nv = sc.nextInt();
		
		for (i = 0; i < size+1 ; i++)	// 10 20 30 40 50
		{								// 10 20 80 30 40 50
			if (i < ni)
				b[i] = a[i];
			else if (i == ni)
				b[i] = nv;
			else
				b[i] = a[i-1];
			
		}
	
		System.out.println("Array a : ");
		for (i = 0 ; i < size+1 ; i++)
		{
			System.out.println(b[i]);
		}
	}
}