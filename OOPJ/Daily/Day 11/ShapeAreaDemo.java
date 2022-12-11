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
	Circle (double r)
	{
		this.r=r;
	}
	
	void getarea()
	{
		area = *r*22/7;
	}
}

class Rectangle extends Shape
{
	Rectangle (double l , double b)
	{
		this.l = l;
		this.b = b;
	}
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
	Square (double s)
	{
		this.s=s;
	}
	void getarea()
	
	{
		area = s*s;
	}
}

class ShapeAreaDemo
{
	public static void main(String args[])
	{
		Rectangle rec = new Rectangle (4,5);
		rec.getarea();
		rec.printArea();
		
		Circle c = new Circle(5);
		c.getarea();
		c.printArea();
	}
}