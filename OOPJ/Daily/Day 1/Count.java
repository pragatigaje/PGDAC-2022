import java.util.Scanner ;

class Count{

	public static void main (String args[]){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number :");
		int num = sc.nextInt();
		
		int cntzero=0 , cnteven=0 , cntodd=0; 
		
		while (num>0)
		{
			if (num%10==0)
			{
				cntzero++;
			}
		
			else if (num%2==0)
			{
				cnteven++;
			}
		
			else
			{
				cntodd++;
			}
			
			num/=10;
			
		}
		
		System.out.println("No of zero :"+cntzero);
		System.out.println("No of odd :"+cntodd);
		System.out.println("No of even :"+cnteven);
		
		
		
		
	}


}