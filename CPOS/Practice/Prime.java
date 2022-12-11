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
		if (temp == 0 )
		{
			System.out.println("NO");
			break;
		}
		else;
		continue;
	}
		System.out.println("Yes");
	
	}

}