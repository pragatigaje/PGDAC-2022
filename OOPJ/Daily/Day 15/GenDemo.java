class Demo <T1, T2>
{
	T1 a;			// a and b are ref variable pointing to object from Integer and 
	T2 b;
	
	Demo()
	{}
	
	Demo (T1 a , T2 b)
	{
		this.a = a;
		this.b = b;
	}
}

class GenDemo
{
	public static void main(String args[])
	{
		Demo<Integer,Double>  d1 = new Demo<Integer,Double>(10,25.6);
	}
}