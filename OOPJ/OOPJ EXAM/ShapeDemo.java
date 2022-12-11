/**Q3: Write a Java Program to implement the given inheritance with Shape is super class for Rectangle and
Triangle class with getArea() to calculate the area of rectangle and triangle.**/

class Shape
{
	double height;
	double width;
	
	void setValues(double height, double width)
	{
		this.height= height;
		this.width=width;
	}
	
	double getHeight()
	{
		return height;
	}
	
	double getWidth()
	{
		return width;
	}
}

class Rectangle extends Shape
{
	double getArea()
	{
		return getHeight()*getWidth();
	}
}

class Triangle extends Shape
{
	double getArea()
	{
		return (getHeight()*getWidth())/2;
	}
}

class ShapeDemo
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		r.setValues(5,10);
		t.setValues(5,10);
		
		double areaOfRectangle = r.getArea();
		System.out.println("Area of the rectangle : "+areaOfRectangle);
		
		double areaOfTriangle = t.getArea();
		System.out.println("Area of the triangle : "+areaOfTriangle);
	}
}