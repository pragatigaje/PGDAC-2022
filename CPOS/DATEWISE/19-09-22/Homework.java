class Operation1{

	
	static int sum(int x, int y)
	{
	return x+y;
	}
	
	static float sum(float x, float y)
	{
	return x+y;
	}
	
	static float sum(double x, double y)
	{
	return (float) (x+y);
	}
	
	static float sum(int x, float y, double z)
	{
	return (float) (x+y);
	}
	
	static float sum(float y, int x, double z)
	{
	return (int) (x+y);
	}

	
	
	
}

class Homework{
	
	public static void main(String [] args){
		
		System.out.println("Sum = "+Operation1.sum(10,11));
		System.out.println("Sum = "+Operation1.sum(10.02f,11.12f));
		System.out.println("Sum = "+Operation1.sum(10.02,11.12));
		System.out.println("Sum = "+Operation1.sum(15.20f,101,11.12));
		System.out.println("Sum = "+Operation1.sum(5,10.02f,11.12));
		
		
	}

}