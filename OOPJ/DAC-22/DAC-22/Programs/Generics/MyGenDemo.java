class MyGen<T>		//similar to => class MyGen <T extends Object>
{
	private T data;
	
	void setData(T data)
	{
		this.data = data;
	}
	
	T getData()
	{
		return data;
	}
	
	static <T1> void myFun(T1 a)
	{
		System.out.println(a);
	}
}


class First
{
	private int a;
	private int b;
	
	First(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String toString()
	{
		return "First[a = " + a + ", b = " + b + "]";
	}
	
}

class MyGenDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>();
		mg1.setData(5);				//mg1.data = 5;
		int a = mg1.getData();			//int = Integer
		System.out.println(a);
		
		MyGen<String> mg2 = new MyGen<String>();
		mg2.setData("Welcome");			//mg2.data = "Welcome";
		String s = mg2.getData();
		System.out.println(s);
		
		MyGen<First> mg3 = new MyGen<First>();
		mg3.setData(new First(15,20));		//mg3.data = new First(15,20);
		First f = mg3.getData();
		System.out.println(f);			//f.toString()
		
		//mg1 = mg2;				//Type safety; compiler shows error
		
		MyGen.myFun("Hello");
		MyGen.myFun(100);
		MyGen.myFun(f);		
		
	}
}

