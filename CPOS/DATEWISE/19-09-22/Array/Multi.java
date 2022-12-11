import java.util.Scanner;

class Multi{
	
	public static void main (String []args){
	
	int size , i,j,res;
	Scanner sc = new Scanner(System.in);
	
	size = sc.nextInt();
	int a[] = new int [size];
	
	for (i=0; i<size ; i++)
	{
		a[i]=sc.nextInt();
	}
	/*
	System.out.print("Input :");
	for (i=0; i<size ; i++)
	{
		System.out.print(a[i]+" ");
	}
	*/
	
	int b[]= new int [size];
	
	for ( i=0; i<size ; i++)
	{
		for (j =0; j<size ; j++)
		{
			res = res*a[size-1];
			size++

		}
	}
	
	
	
	
	}
	
}