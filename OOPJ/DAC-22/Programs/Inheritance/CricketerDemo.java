class Cricketer
{
	String name;
	String country;
	int totMatches;
	
	void setDetails(String name, String country, int totMatches)
	{
		this.name = name;
		this.country = country;
		this.totMatches = totMatches;
	}
	
	void printDetails()
	{
		System.out.println(name);
		System.out.println(country);
		System.out.println(totMatches);
	}
}

class Batsman extends Cricketer		//Now Batsman is the child class of Cricketer
{
	int totRuns;
	
	void setTotRuns(int totRuns)
	{
		this.totRuns = totRuns;
	}
	
	void printTotRuns()
	{
		System.out.println(totRuns);
	}
	
	void printBatsDetails()
	{
		System.out.println(name);
		System.out.println(country);
		System.out.println(totMatches);
		System.out.println(totRuns);
	}
}

class Bowler extends Cricketer		//Now Bowler is the child class of Cricketer
{
	int totWickets;
	
	void setTotWickets(int totWickets)
	{
		this.totWickets = totWickets;
	}
	
	void printTotWickets()
	{
		System.out.println(totWickets);
	}
}

class CricketerDemo
{
	public static void main(String args[])
	{
		Cricketer c1 = new Cricketer();
		c1.setDetails("Sachin","India",400);
		c1.printDetails();
		
		Batsman bats1 = new Batsman();
                bats1.setDetails("Risabh Pant","India",100);//will call parent class (Cricketer) setDetails()
                bats1.setTotRuns(3000);	//will call child class (Batsman) setTotRuns()
		//bats1.printDetails();	//will call parent class printDetails()
		//bats1.printTotRuns();	//will call child class printTotRuns()
		
		bats1.printBatsDetails();	//will call child class' printBatsDetails()
		
		
		Bowler bowl1 = new Bowler();
		bowl1.setDetails("Bumrah","India",150);	//parent class' setDetails() called
		bowl1.setTotWickets(350);	//child class' (Bowler) setTotWickets() called
		bowl1.printDetails();		//parent class' printDetails() called
		bowl1.printTotWickets();	//child class' (Bowler) printTotWickets() called
		
	}
}




