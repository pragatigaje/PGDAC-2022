import java.util.Scanner;
class SwitchFloat{
	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	float f = sc.nextFloat();
	
	switch (f){
		case 1.1f: 
			System.out.println("Topic : Algorithm and Flowchart");
			break;
		case 1.2f: 
			System.out.println("Topic : SOP Statement");
			break;
		case 1.3f: 
			System.out.println("Topic : If else Statement");
			break;
		case 1.4f: 
			System.out.println("Topic : For loop");
			break;
		case 1.5f: 
			System.out.println("Topic : While loop");
			break;
	
		default:
			System.out.println("Topic is not valid");
	}
	}

}