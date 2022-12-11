import java.util.Scanner;
class SwitchDouble{
	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	double d = sc.nextDouble();
	
	switch (d){
		case 1.1: 
			System.out.println("Topic : Algorithm and Flowchart");
			break;
		case 1.2: 
			System.out.println("Topic : SOP Statement");
			break;
		case 1.3: 
			System.out.println("Topic : If else Statement");
			break;
		case 1.4: 
			System.out.println("Topic : For loop");
			break;
		case 1.5: 
			System.out.println("Topic : While loop");
			break;
	
		default:
			System.out.println("Topic is not valid");
	}
	}

}
// NOT POSSIBLE TO ACCEPT DOUBLE
// error: incompatible types: possible lossy conversion from double to int
//        switch (d){