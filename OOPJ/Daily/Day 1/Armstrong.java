import java.util.Scanner;

class Armstrong{

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int last=0, digits=0;
	int temp;
	int sum =0;
	
	temp=num;
	
	while(temp>0)
	{
		temp/=10;
		digits++;
	}
	
	temp=num;
	while(temp>0)
	{
		last= temp % 10;
		sum += (int)(Math.pow(last,digits));
		temp/=10;
	}
	
	if ( sum == num)
	{
		System.out.println ("Armstrong Number");
	}
	else
		System.out.println("NO Armstrong Number");
	
	
	}


}

