class TwoNumbers <T extends Number>
{
	T a;
	T b;
	
	TwoNumbers(T a, T b)
	{
		this.a = a;
		this.b = b;
	}
	
	double sum()
	{
		double res = a.doubleValue() + b.doubleValue();
		return res;
	}
}

class TwoNumbersDemo
{
	public static void main(String args[])
	{
		TwoNumbers <Integer> tn1 = new TwoNumbers<Integer>(5,10);
		double res = tn1.sum();
		System.out.println(res);
		
		TwoNumbers <Double> tn2 = new TwoNumbers<Double>(15.5,20.8);
		res = tn2.sum();
		System.out.println(res);
	}
}

