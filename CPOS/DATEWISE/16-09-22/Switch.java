import java.util.Scanner;
class Switch{
	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	
	switch (i){
		case 1: 
			System.out.println("Today is Monday");
			break;
		case 2: 
			System.out.println("Today is Tuesday");
			break;
		case 3: 
			System.out.println("Today is Wednesday");
			break;
		case 4: 
			System.out.println("Today is Thurdday");
			break;
		case 5: 
			System.out.println("Today is Friday");
			break;
		case 6: 
			System.out.println("Today is Saturday");
			break;
		case 7: 
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Day is NOT VALID");
	}
	}

}