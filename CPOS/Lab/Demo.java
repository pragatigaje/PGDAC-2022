class Demo
{
	void display ()
	{
		int a;
		System.out.println("I am Display");
		this.a =50;
		System.out.println("a = "+a);
		this.show(); // this is refference variable to invoked anything in class like variable, method, contructor
	}
	
	void show ()
	{
		System.out.println("I am Show");
	}
		
	public static void main (String [] args){
		Demo o1 = new Demo();
		o1.display();
		
	}
	
	
	
	/*
	Demo()
	{
		this(4.5); // 'this': will call Demo(double) 
		System.out.println("from Demo ()");
	}
	Demo(int i)
	{
		// it will get print and control will return back
		System.out.println("from Demo ((int i))");
	}
	Demo(double b)
	{
		this(10); //'this': will call Demo(int)
		System.out.println("from Demo (double b)");
	}
	
	public static void main (String [] args){
		Demo o1 = new Demo(); // call default constructor Demo()
	}
	

*/	
}