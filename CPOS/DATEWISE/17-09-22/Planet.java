import java.util.*;

class Planet{
	
	static int n;
	int choice;
	
	
	static int enterChoice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Planet Number : 1.Earth 2.Mercury 3.Saturn");
		int n = sc.nextInt();
		return n;
		
	}
	
	static void getInfo (int choice)
	{
		switch(choice){
		
			case 1 :
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number for which information do you need :");
				System.out.println("1.Name and Overview\n 2.Distance from Sun\n 3.Mean Orbit Velocity\n 4.Number of Moons\n");
				int p = sc.nextInt();
				
					switch (p){
						case 1:
							System.out.println("Name of the Planet = Earth");
							System.out.println("Earth is the third planet from the Sun, and the only place we know of so far that’s inhabited by living things.");
							break;
						case 2:
							System.out.println("Distance from Sun = 150.34 million km");
							break;
						case 3:
							System.out.println("Mean Orbit Velocity = 66,622 mph");
							break;
						case 4:
							System.out.println("Number of Moons = 1");
							break;
						default:
							System.out.println("Invalid Info request");
					}
			case 2 :
		}
	}
	
	
	
	public static void main (String [] args){
		
		int choice = enterChoice();
		getInfo(choice);
		
	}



}