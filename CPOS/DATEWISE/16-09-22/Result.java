import java.util.Scanner;
class Result{
	public static void main(String args []){
	
	Scanner sc = new Scanner(System.in);
	
	//System.out.println("Select option according to your marks :");
	//System.out.println("1.85 and above 2.60 to 85 3.50 to 60 4.40 to 50 5.Below 40");
	
	System.out.println("Enter your marks");
	int marks = sc.nextInt();
	int res=0;
	
	(marks>=80) ? (marks>=60 && marks<85) ? (marks>=50 && marks<60) ? (marks>=40 && marks<50) ? (marks<40) ? (res=1) : (res=2) : (res=3) : (res=4) : (res=5) ;
	
	
	
	switch(res){
		
		case 1 :
				System.out.println("Congratulations!!!");
				System.out.println("You got Distinction class!");
				break;
		
		case 2:
				System.out.println("Congratulations!!!");
				System.out.println("You got First class!");
				break;
		
		case 3:
				System.out.println("You got Second class!");
				break;
		
		case 4 :
				System.out.println("You got Third class!");
				break;
		
		case 5 :
				System.out.println("You are Fail!");
				break;
		default :
				System.out.println("Marks are invalid");
		
		
	}
	
		
}
}