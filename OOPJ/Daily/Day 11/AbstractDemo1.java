abstract class Shape
{
	double area;
	abstract void getarea();
	void printArea()
	{
		System.out.println("Area = "+area);
	}
}

class Circle extends Shape
{
	double r;
	void getarea()
	{
		area = (22/7)*r*r;
	}
}

class Rectangle extends Shape
{
	double l;
	double b;
	void getarea()
	{
		area = l*b;
	}
	
}

class Square extends Shape
{
	double s;
	void getarea()
	{
		area = s*s;
	}
}

class AbstractDemo1
{
	public static void main(String args[])
	{
		
	}
}