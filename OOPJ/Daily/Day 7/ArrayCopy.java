import java.util.*;
class ArrayCopy{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	int arr1[]= new int [5];
	int arr2[]= new int [5];
	
	for (int i =0 ; i<5 ; i++)
	{
		arr1[i]= sc.nextInt();
	}
	
	for (int i =0 ; i<5 ; i++)
	{
		arr2[i]= arr1[i];
	}
		
	System.out.print("1st Array :");
	for (int i =0 ; i<5 ; i++)
	{
		System.out.print(arr1[i]+" ");
	}
	
	System.out.print("2nd Array :");
	for (int i =0 ; i<5 ; i++)
	{
		System.out.print(arr2[i]+" ");
	}
	
	
	}
	

}