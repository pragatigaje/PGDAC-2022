import java.util.*;
class Circle{

	final static double pi = Math.PI;
	
	double area (double r)
	{
		return pi*r*r;
	}
	
	double circum(double r)
	{
		return pi*2*r;
	}

	public static void main (String args []){
	Scanner sc = new Scanner(System.in);
	Circle o1 = new Circle();
	Circle o2 = new Circle();
	
	
	System.out.println("Enter radius of circle : ");	
	double r = sc.nextDouble();

	System.out.println("Area of circle : "+o1.area(5));
	System.out.println("Cicumference of circle : "+o2.circum(r));
	
	}

}