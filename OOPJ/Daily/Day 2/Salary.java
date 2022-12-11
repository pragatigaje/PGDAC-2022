import java.util.*;
class Salary{
	public static void main (String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter you basic salary : ");
	long salary = sc.nextLong();
	double da=0 , hra=0 , gs=0;
	
	if (salary < 10000)
	{
		da = salary*0.9;
		hra = salary*0.1;
		gs = salary+da+gs;
		System.out.println("Gross salary : Rs."+gs);
	}
	
	else
	{
		da = salary*0.98;
		hra = 2000;
		gs = salary+da+gs;
		System.out.println("Gross salary : Rs."+gs);
	}	
		
	}

}