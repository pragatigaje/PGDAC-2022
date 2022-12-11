import java.util.Scanner;
public class Combine1{
	
	
	static int x = 20;		// static variable
	int y = 30;				// instance variable
	

	void display()
	{
		System.out.println(x);
		System.out.println(y);
		show();
	}
	
	static void show()
	{
		System.out.println("x = "+x);
		// System.out.println("y = "+y);
	}

	public static void main(String args[]){
		
		Combine1 c1 = new Combine1();
		c1.display();
		
		show();
		
		
	}
 

}