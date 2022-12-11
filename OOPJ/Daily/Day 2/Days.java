import java.util.*;
class Days{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter no of days :");
	int n = sc.nextInt();
	int temp = n;
	int y=0, m=0, d=0;
	
	y=n/365;
	System.out.print(y+" Years ");
	if (n%365 > 0 )
	{
		temp = n%365;
		if (temp < 30)
		{
			System.out.print(temp+"Days ");
		}
		
		else 
		{
			m = temp/30;
			System.out.print(m+" Months ");
			d = temp%30;
			System.out.print(d+" Day ");
		}
	}
	
	}


}