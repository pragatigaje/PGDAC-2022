class Batsman 
{
	int run = 1000;
	
	Batsman()
	{
	}

	//outer class can not access inner class member but static inner class can access only static members of the outer class.
	//If outer class wants to access inner class member, it will have to first create the inner class object
	void printAverage()
	{
		System.out.println("printAverage of Batsman");
		AvgCalculator avgCal = new AvgCalculator();
		avgCal.myFun();
	}

	//Static Inner class
	static class AvgCalculator
	{
		void myFun()
		{
			//run = run + 100;	//error: non-static member can not be accessed from static context.
			System.out.println("myFun of AvgCalculator");
		}
	}
}

class StaticInnerClassDemo
{
	public static void main(String args[])
	{
		Batsman bats1 = new Batsman();
		bats1.printAverage();	

		Batsman.AvgCalculator avgCal = new Batsman.AvgCalculator();
		avgCal.myFun();

	}
}
