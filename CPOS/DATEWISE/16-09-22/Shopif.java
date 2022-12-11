import java.util.Scanner;
class Shopif{
	public static void main(String args []){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number for offers:");
	System.out.println("1.Monday 2.Tuesday 3.Wednesday 4.Thursday 5.Friday 6.Saturday 7.Sunday");
	int day = sc.nextInt();
	
	
	if (day==1)
		System.out.println("Monday Offer = 5Kg Sugar FREE ");
	else
		if (day==2)	
		System.out.println("Tuesday Offer = 5Kg Rice FREE");
		else
			if (day==3)	
			System.out.println("Wednesday Offer = 500gm Almond FREE");
			else
				if (day==4)	
				System.out.println("Thursday = 500gm Cashew FREE");
				else
					if (day==5)	
					System.out.println("Friday Offer = 1Kg Groundnuts FREE");
					else
						if (day==6)	
						System.out.println("Saturday Offer = 1Kg Poha FREE");
						else
							if (day==7)	
							System.out.println("Sunday Offer = 1Kg Gulabjam Mix FREE");
							else 
								System.out.println("Not Availabe");
					
	}

}