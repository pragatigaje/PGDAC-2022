import java.util.*;

class PrimeCheck{
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int flag = 0;
		
		for (int i=2 ; i<num; i++)
		{
			if (num%i==0)
			{
				System.out.println("No it is not a Prime Number.");
				flag=1;
				break;
			}
			
		}

		if (flag==0)
				System.out.println("Yes it is a Prime Number.");
		
		
	}
	
	
	
	
}