class Counter 
{
	// int count; 			//will get memory each time when the instance is created  
	static int count;		//will get memory only once and retain its value
	
	Counter()
	{
		count++;
		System.out.println("Count = "+count);
	}
	
}
class StaticDemo2 
{
	public static void main(String args[])
	{
		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
	}
}