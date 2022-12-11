import java.util.*;

class BankSystem{
	
	static int x= 2000;
	static int c;
	
	static void display()
	{
		System.out.println ("Welcome to Pragati co. Bank!!!!");
	}
	
	static int getOption()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the Operation ");
		System.out.println ("1.Deposit 2.Withdraw 3.Balance Check ");
		int o = sc.nextInt();
		return o;
	}
	
	static void doOperation(int c)
	{
		
		switch (c){
			
			case 1 :
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the amount to be deposited :");
				int depo= sc.nextInt();
				x += depo;
				System.out.println("Successfully Deposited !!!");
				displayBalance();
				break;
				
			case 2: 
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the amount to be Withdrawn :");
				int with= sc1.nextInt();
				x -= with;
				if (x<1000)
					System.out.println("Warning !!!\nYour current balance is less than Rs.1000");
				else
				System.out.println("Successfully Withdrawn!!!");
				displayBalance();
				break;
				
			case 3:
				System.out.println("Your total balance is "+x);
			
		}
	}
	
	static void displayBalance()
	{
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Do you want to display your balance : Y	or N");
		String acc= sc2.nextLine();
			if (acc == "Y")
				System.out.println("Your Current Balance is :"+x);
			else 
				System.out.println("Thank You for Banking");
	}
	
	public static void main(String [] args){
		
		display();
		c=getOption();
		doOperation(c);
		
	}

}