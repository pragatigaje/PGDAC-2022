import java.util.*;

class Array1{

	public static void main(String args[]){
	
	// Dynamic Array
	int size,i;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of array :");
	size = sc.nextInt();
	int arr[]= new int[size];
	
	for (i=0; i<size; i++)
	{
		arr[i]=sc.nextInt();
	}
		System.out.print("Printed elements: ");
	for (i=0; i<size ;i++)
	{
		System.out.print("Index of "+i+" = "+arr[i]);
	}
		
	
	
	
	
	/*
	
	// Static Array
	
	int arr[]= {10,20,30,40,50};	
	//System.out.println(arr[0]);
	
	for (int i=0; i<arr.length ; i++)
	{
		System.out.println("Index of "+(i)+" "+(arr[i]));
	}
	*/
	
	}

}