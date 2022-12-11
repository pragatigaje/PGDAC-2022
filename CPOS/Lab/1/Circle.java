class Circle{

	static double pi = 3.14 ;
	
	static double circum(double r)
	{
		return 2*pi*r;
	}

	static double area (double r)
	{
		return pi*r*r;
	}
	
	public static void main (String args[]){
	Circle o1 = new Circle();
	//System.out.println("Enter a radius");
	double c = circum(5.0);
	double a = area(5.0);
	System.out.println("Cicumference of circle is= "+c);
	System.out.println("Area of a circle ="+a);
	
	
	
	}


}