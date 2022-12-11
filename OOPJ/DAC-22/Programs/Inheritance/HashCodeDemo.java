class Demo
{
	int a;

	void fun1()
	{
		System.out.println("fun1 of Demo");
	}
}

class HashCodeDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
