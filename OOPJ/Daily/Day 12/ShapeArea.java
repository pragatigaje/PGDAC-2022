interface Shape
{	
	void calArea();
}

class Rectangle implements Shape
{
	Rectangle()
	{}
	Rectangle (int length, int breadth)
	{
		this.length= length;
		this.breadth=breadth;
	}
	double length;
	double breadth;
	public void calArea()
	{
		double area = length*breadth;
		System.out.println("Area = "+area);
	}
	
}

class Square implements Shape
{	
	Square()
	{}
	
	Square(int side)
	{
		this.side=side;
	}
	double side;
	public void calArea()
	{
		double area = side*side;
		System.out.println("Area = "+area);
	}
}

class Circle implements Shape
{
	Circle()
	{}
	
	Circle(int radius)
	{
		this.radius = radius;
	}
	double radius;
	public void calArea()
	{
		double area = radius*radius*22/7;
		System.out.println("Area = "+area);
	}
}

class ShapeArea
{
	public static void main(String args[])
	{
		Rectangle rec = new Rectangle(5,10);
		Square sq = new Square(20);
		Circle c = new Circle(15);
		
		rec.calArea();
		sq.calArea();
		c.calArea();
	}
}