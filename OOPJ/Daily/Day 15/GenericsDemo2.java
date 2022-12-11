class MyGen<T>
{
	T data;
	void setdata(T data)
	{
		this.data=data;
	}
	
	T getdata()
	{
		return data;
	}
}

class First
{
	int a;
	int b;
	
	First(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public String toString()
	{
	return "First = [ a: "+a+" b : "+b+"]";
	}	
}

class GenericsDemo2
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>();
		mg1.setdata(5);
		int a = mg1.getdata();
		System.out.println(a);
		
		MyGen<String> mg2 = new MyGen<String>();
		mg2.setdata("Welcome");
		String s = mg2.getdata();
		System.out.println(s);
		
		MyGen<First> mg3 = new MyGen<First>();
		mg3.setdata(new First(15,20));
		First f = mg3.getdata();
		System.out.println(f);
		
		//mg1=mg2;
	}
}