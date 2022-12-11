class Factorial
/*{
	static int factorial(int n)
	{
		if (n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String args[])
	{
		System.out.println(factorial(10));
	}
}*/

//*The idea is to use one more argument and accumulate 
// the factorial value in the second argument. 
// When n reaches 0, return the accumulated value.

{
	// A tail recursive function
    // to calculate factorial
	static int factorial(int n, int a)
	{
		if (n <= 0)
			return a;
		else
			return factorial(n-1, n*a);
	}
	
	// A wrapper over factorial
	static int fact(int n)
	{
		return factorial(n, 1);
	}
	
	public static void main(String args[])
	{
		System.out.println(fact(5));
	}
}