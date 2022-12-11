import java.util.*;
class Switch3{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any choice : ");
	String level = sc.next();
		
	switch (level)
	{
		case "Low" :
			System.out.println("Great luck !!");
			break;
		case "Intermediate" :
			System.out.println("Do hardwork !!");
			break;
		case "Hard"	:
			System.out.println("Go and sleep!!");
			break;
			
		default:
			System.out.println("Sorry....invalid input ");
	}
		
		
		
	}

}