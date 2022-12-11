class TwoNumbers<T1 , T2>
{
	T1 a;
	T2 b;
	
	TwoNumbers(T1 a, T2 b)
	{
		this.a = a;
		this.b = b;
	}
	
	<?> getOb()
	{
		return ob;
	}
	
}

class GenericsDemo
{
	public static void main(String args[])
	{
		TwoNumbers<Integer, Double> tn1 = new TwoNumbers<Integer,double>(10,15.2);
		tn1.getOb();
		System.out.println(tn1);	
	
	}
}
