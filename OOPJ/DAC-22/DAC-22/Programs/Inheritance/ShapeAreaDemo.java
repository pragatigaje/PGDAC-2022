abstract class Shape
{
	double area;
	
	abstract void calArea();

	Shape()
	{
		System.out.println("Shape constructor");
	}
	
	void printArea()
	{
		System.out.println(area);
	}
}

class Circle extends Shape
{
	double radius;
	
	Circle()
	{
	
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	void calArea()
	{
		area = 3.14 * radius * radius;
	}
}

class Rectangle extends Shape
{
	double len;
	double br;
	
	Rectangle()
	{
	
	}
	
	Rectangle(double len, double br)
	{
		this.len = len;
		this.br = br;
		System.out.println("Rectangle constructor");
	}
	
	void calArea()
	{
		area = len * br;
	}
}

class Square extends Shape
{
	double side;
	
	Square()
	{
	
	}
	
	Square(double side)
	{
		this.side = side;
	}
	
	void calArea()
	{
		area = side * side;
	}
}

class ShapeAreaDemo
{
	public static void main(String args[])
	{
		Shape s[];
		s = new Shape[3];
		
		s[0] = new Rectangle(4.0,5.0);
		s[1] = new Square(8.0);
		s[2] = new Circle(5.0);
		
		for(int i = 0; i < 3; i++)
		{
			s[i].calArea();	//Same statement is calling different methods of different class. 					//Polymorphic behaviour.
			s[i].printArea();
		}
		
	}
}
