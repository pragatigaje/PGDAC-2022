import java.util.*;
class Fahrenheit{
	
	static double f;
	double toConvert(double temp)
	{
		f = (temp*9/5)+32;
		return f ; 
	}

	public static void main (String args []){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter temperature in Celsius : ");
	double temp = sc.nextDouble();
	
	Fahrenheit t1 = new Fahrenheit();
	f = t1.toConvert(temp);
	
	System.out.println("After Conversion into Fahrenheit : "+f+" F");
	
	
	}

}