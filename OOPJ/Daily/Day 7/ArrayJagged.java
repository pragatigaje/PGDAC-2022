import java.util.*;
class ArrayJagged{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	int jag[][] = new int [3][];

	for (int i=0; i<jag.length; i++)
	{
		for (int j=0; j<jag[0].length; j++)
		{
			jag[i]= sc.nextInt();
		}
		System.out.println();
		
	}
	
	for (int i=0; i<jag.length; i++)
	{
		for (int j=0; j<jag[0].length; j++)
		{
			System.out.print(jag[i][j]+" ");
		}
		System.out.println();
		
	}
	
	
	}

}