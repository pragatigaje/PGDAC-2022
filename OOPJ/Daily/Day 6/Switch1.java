import java.util.*;
class Switch1{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any choice : ");
	int choice = sc.nextInt();
		
	switch (choice)
	{
		case 1 :
			System.out.println("I am One ");
			break;
		case 2 :
			System.out.println("I am Two ");
			break;
		case 3 :
			System.out.println("I am Three ");
			break;
		case 4 :
			System.out.println("I am Four ");
			break;
		default:
			System.out.println("Sorry....invalid input ");
	}
		
		
		
	}

}