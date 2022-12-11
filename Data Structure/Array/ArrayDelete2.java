import java.util.*;

 
class ArrayDelete2
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
		
		//taking input of index
		System.out.println("Enter index of new value to be deleted : ");
		int di = sc.nextInt();
		size--;
		
		for (i=0 ; i < size ; i++)	// 10 20 30 40 50
		{							// 10 20 40 50
			if(i <di )
				continue;
			else
				a[i]= a[i+1];				
		}
		
		System.out.println("Array a : ");
		for (i = 0 ; i < size ; i++)
		{
			System.out.println(a[i]);
		}
	}
}