
class Demo
{
	int a;
	int b;

	Demo()
	{
	}

	Demo(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public String toString()			//Overriding toString() of Object class
	{
		String str = "Demo[a = " + a + ", b = " + b + "]";	//str = "Demo[a = 5, b = 10]"
		return str;
	}
	
	public boolean equals(Demo obj)
	{
		if(this.a == obj.a && this.b == obj.b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return 31*(a+b);
	}
}

class ObjectMethodsOverrideDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(5,10);
		System.out.println(d1);		//System.out.println(d1.toString())
		
		Demo d2 = new Demo(5,10);
		
		System.out.println("d1.equals(d2) : " + d1.equals(d2));//will print d1.equals(d2) : true	
		System.out.println("d1.hashcode : " + d1.hashCode());
		System.out.println("d2.hashcode : " + d2.hashCode());
	}
}
