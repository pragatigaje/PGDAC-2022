import java.util.Scanner ;
class PrimePrint{
	public static void main(String args []){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter upto which you have to print prime numbers :");
	int count = sc.nextInt();
	int flag = 0;

	System.out.println("prime numbers :");
	
	count:for (int i = 2; i<=count; i++)
	{
		if (i == 2 || i == 3)
			{
				System.out.println(i);
				continue;
			}
			
		factors: for (int j = 2; j<(count/2) ; j++)
		{
			
			
			if (i%j == 0)
				{break factors;}
			
			else if(j>=(count/2))
			{
				System.out.println(i);
				break;
			}
			
			else
				continue;
		}
		
	}

	
	}
		
	}


