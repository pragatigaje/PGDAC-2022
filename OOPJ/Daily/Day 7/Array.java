import java.util.*;
class Array{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	int arr2[][] = new int [2][3];

	arr2 [0][0]=10;
	arr2 [0][1]=20;
	arr2 [0][2]=30;
	arr2 [1][0]=100;
	arr2 [1][1]=200;
	arr2 [1][2]=300;
	
	// System.out.println(arr2.length);
	// System.out.println(arr2[0].length);

	for (int i=0; i<arr2.length; i++)
	{
		for (int j=0; j<arr2[0].length; j++)
		{
			System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
		
	}
	
	}

}