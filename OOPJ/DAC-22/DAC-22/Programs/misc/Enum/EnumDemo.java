enum TShirtColors
{
	RED(3.5,"Good"),GREEN(4.0,"Good"),BLUE(4.5,"Excellent"),YELLOW(2.5,"Poor"),ORANGE(3,"Average");	//Each of these are an object of TShirtColors itself.

	double rating;
	String remarks;

	TShirtColors()
	{
		System.out.println("Constructor called");
	}

	TShirtColors(double rating, String remarks)
	{
		this.rating = rating;
		this.remarks = remarks;
	}

	String getRemarks()
	{
		return this.remarks;
	}

	double getRating()
	{
		return this.rating;
	}
}

class DenimShirts
{
	double price;
	TShirtColors color;

	public String toString()
	{
		return "DenimShirts[price = " + price + ", color = " + color + ", rating = "+ color.rating + ", remarks = "+ color.remarks + "]";
	}
}

public class EnumDemo
{
	public static void main(String args[])
	{
		DenimShirts ds1 = new DenimShirts();
		ds1.price = 2000;
		ds1.color = TShirtColors.BLUE;

		//System.out.println(ds1);

		System.out.println(TShirtColors.GREEN.remarks);

		//new TShirtColors();	//Error: enum type can not be instantiated.	
		
		switch(ds1.color)
		{
			case RED:
				System.out.println("Shirt color is red");
				break;
			case GREEN:
				System.out.println("Shirt color is green");
				break;
			case BLUE:
				System.out.println("Shirt color is blue");
				break;
			case YELLOW:
				System.out.println("Shirt color is yellow");
				break;
			case ORANGE:
				System.out.println("Shirt color is orange");
				break;
			default:
				System.out.println("Shirt color is not present");
		}

		if(ds1.color == TShirtColors.RED)
		{
			System.out.println("It is red");
		}
		else
		{
			System.out.println("It is not red");
		}

		System.out.println("Ordinal value for BLUE " + TShirtColors.BLUE.ordinal());
		System.out.println("Rating for BLUE " + TShirtColors.BLUE.getRating());//ds1.color.getRating();
		System.out.println(TShirtColors.RED.compareTo(TShirtColors.YELLOW));
		System.out.println(ds1.color.equals(TShirtColors.YELLOW));

	}
}

