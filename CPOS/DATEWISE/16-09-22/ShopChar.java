import java.util.Scanner;
class ShopChar{
	public static void main(String args []){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Option for offers:");
	System.out.println(" M for Monday\n T for Tuesday\n W for Wednesday\n t for Thursday\n F for Friday\n S for Saturday\n s for Sunday\n");
	char day = sc.next().charAt(0);
	
	switch (day){
	
		case 'M' : 
			System.out.println("Monday Offer = 5Kg Sugar FREE ");
			break;
		case 'T' :
			System.out.println("Tuesday Offer = 5Kg Rice FREE");
			break;
		case 'W' :
			System.out.println("Wednesday Offer = 500gm Almond FREE");
			break;
		case 't' :
			System.out.println("Thursday = 500gm Cashew FREE");
			break;
		case 'F' :
			System.out.println("Friday Offer = 1Kg Groundnuts FREE");
			break;
		case 'S' :
			System.out.println("Saturday Offer = 1Kg Poha FREE");
			break;
		case 's' :
			System.out.println("Sunday Offer = 1Kg Gulabjam Mix FREE");
			break;
		default :
			System.out.println("Not Availabe");
	}
	
	
	}

}