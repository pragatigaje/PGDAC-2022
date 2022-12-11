import java.util.*;

class First
{
}

class Shape
{
	void calArea()
	{
		System.out.println("calArea of Shape");
	}
}

class Rectangle extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Rectangle");
	}
}

class Square extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Square");
	}
}

class Circle extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Circle");
	}
}


class ListDemoWithoutType
{
	public static void main(String args[])
	{
		List numList1 = new ArrayList();	//Old version and not recommended
		numList1.add(5);
		numList1.add(10);
		numList1.add(15);
		numList1.add("hello");
		numList1.add(new First());
	myLi
		//int a = (Integer)(numList1.get(3));	//Runtime error
		//System.out.println(a);
		
		List<Shape> myList = new ArrayList<>();

	st.add(new Shape());
		myList.add(new Rectangle());
		myList.add(new Square());
		myList.add(new Circle());
		myList.add(new First());

		Shape s = myList.get(2);
		s.calArea();

		s = myList.get(3);
		s.calArea();

	}
}
