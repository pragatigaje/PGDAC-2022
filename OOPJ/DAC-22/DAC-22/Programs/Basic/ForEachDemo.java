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
	
	public String toString()
	{
		return "[a = " + a + ", b = " + b + "]";
	}
	
	public void fun()
	{
		System.out.println("fun of Demo");
	}
	
}

class ForEachDemo
{
	public static void main(String []args)
	{
		int arr[] = {5,10,15,20,25};
		
		System.out.println("Print array using normal for loop");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Print array using for-each loop");
		
		for(int x : arr)
		{
			System.out.println(x);
		}
		
		
		Demo d[] = new Demo[3];
		d[0] = new Demo(5,10);
		d[1] = new Demo(12,15);
		d[2] = new Demo(17,20);
		
		for(Demo x : d)
		{
			System.out.println(x);
			x.fun();
		}		
	}
}
