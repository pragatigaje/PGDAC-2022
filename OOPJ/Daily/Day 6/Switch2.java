import java.util.*;
class Switch2{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any choice : ");
	char ch = sc.next().charAt(0);
		
	switch (ch)
	{
		case 'a' :
			System.out.println("I am small a");
			break;
		case 'A' :
			System.out.println("I am Capital A ");
			break;
			
		default:
			System.out.println("Sorry....invalid input ");
	}
		
		
		
	}

}