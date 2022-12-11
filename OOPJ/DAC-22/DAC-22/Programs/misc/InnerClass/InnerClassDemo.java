class Batsman 
{
	private int totRuns;
	private int totMatches;
	
	Batsman()
	{
	}

	Batsman(int totRuns, int totMatches)
	{
		this.totRuns = totRuns;
		this.totMatches = totMatches;
	}

	//outer class can not access inner class member but inner class can access outer class members.
	//If outer class wants to access inner class member, it will have to first create the inner class object
	void printAverage()
	{
		AvgCalculator avgCal = new AvgCalculator();
		double res = avgCal.calAverage();
		System.out.println("Batsman average is : " + res);
	}

	//Inner class
	class AvgCalculator
	{
		double avg;

		double calAverage()
		{
			avg = totRuns / totMatches;
			return avg;
		}
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
		Batsman bats1 = new Batsman(5000,200);
		bats1.printAverage();

		Batsman bats2 = new Batsman(2000,100);

		Batsman.AvgCalculator avgCal2 = bats2.new AvgCalculator();
		double res = avgCal2.calAverage();
		System.out.println("**Batsman average is : " + res);

		//AvgCalculator avgCal2 = new AvgCalculator();	//Error
		//avgCal2.printAverage();	//Error

	}
}
