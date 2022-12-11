class Demo
{
	int a;
	Demo()
	{}
	
	Demo (int a)
	{
		this.a=a;
	}
	void fun1()
	{
		System.out.println("fun1 of Demo");
	}
}
class ToStringMethod
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3;
		d3 = d1;
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		System.out.println(d2.toString());
		System.out.println(d2.toString());	//returns ObjectClassName@HashCodeInHexaFormat
		
		System.out.println(d1.equals(d3));
		System.out.println(d2);
		
	}
}