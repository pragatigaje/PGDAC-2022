import java.util.Scanner;

enum Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;
}

class ShopEnum{
	public static void main(String args []){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number for offers:");
	System.out.println("1.Monday 2.Tuesday 3.Wednesday 4.Thursday 5.Friday 6.Saturday 7.Sunday");
	int day = sc.nextInt();
	
	switch (day){
	
		case 1 : 
			System.out.println("Monday Offer = 5Kg Sugar FREE ");
			break;
		case 2 :
			System.out.println("Tuesday Offer = 5Kg Rice FREE");
			break;
		case 3 :
			System.out.println("Wednesday Offer = 500gm Almond FREE");
			break;
		case 4 :
			System.out.println("Thursday = 500gm Cashew FREE");
			break;
		case 5 :
			System.out.println("Friday Offer = 1Kg Groundnuts FREE");
			break;
		case 6 :
			System.out.println("Saturday Offer = 1Kg Poha FREE");
			break;
		case 7 :
			System.out.println("Sunday Offer = 1Kg Gulabjam Mix FREE");
			break;
		default :
			System.out.println("Not Availabe");
	}
	
	
	}

}