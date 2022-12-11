import java.util.*;
class ArrayWithMethods
{
	static int i;
	
	static void display(int a[], int size)
	{
		System.out.println("Array a : ");
		for (i = 0 ; i < size ; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	static void delete(int size, int di, int[]a)
	{
		//size--;
		for (i=0 ; i < size ; i++)	// 10 20 30 40 50
		{							// 10 20 40 50
			if(i < di )
				continue;
			else
				a[i]= a[i+1];
		}
		display(a,size);
	}
	
	static void add(int size, int ni, int nv, int[]a) 	//10 20 30 40 50
	{													//10 20 80 30 40 50						
		size++;
		for(i = size; i >= ni; i--)
		{
			a[i+1]=a[i];
		}
		a[ni]=nv;
		//display(a, size);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int a[] = new int [100];
		System.out.println("Enter values : ");
		for (i = 0 ; i < size ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		display(a, size);
		//System.out.println("Enter index of new value to be deleted : ");
		//int di = sc.nextInt();
		//delete(size, di, a);
		
		System.out.println("Enter index of new value to be inserted : ");
		int ni = sc.nextInt();
		System.out.println("Enter new value to be inserted : ");
		int nv = sc.nextInt();
		add(size, ni, nv, a);
		display(a, size+1);
	}
}