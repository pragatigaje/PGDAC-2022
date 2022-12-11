import java.util.* ;

class PrimeCheck{

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp =n;
	int m;
	m = n/2;
	
	for (int i=2; i>=m ; i++)
	{
		temp %= i;
		if (temp != 0)
		{	
			if (i <= m)
			{
			System.out.println("It is a prime number");
			break;
			}
			
			else;
			{
			continue;
			}
		}
		else
		{
			System.out.println("It is not a prime number");
		}
	}
		
	
	}

}