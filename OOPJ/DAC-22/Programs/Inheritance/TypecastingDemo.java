class First
{
	void fun()
	{
		System.out.println("fun of First");
	}
}

class Second extends First
{
	void fun()
	{
		System.out.println("fun of Second");
	}
}

class Third
{
	void fun()
	{
		System.out.println("fun of Third");
	}
}

class TypecastingDemo
{
	public static void main(String args[])
	{
		First f = new First();
		Second s = new Second();
		Third t = new Third();
		
		//f = (First)s;	// f = s; is also fine; Upcasting
		//f.fun();	//Second fun()
		
		//f = (First)t;	//Error, as there is no inheritance relationship between First and Third
		
		//s = f;	//Error, child ref = parent obj
		
		//s = (Second)f;		//No compilation error, but runtime error :ClassCastException: First cannot be 					//cast to Second
		//s.fun();
		
		((Second)f).fun();
		//f.fun();	
		
	}
}
