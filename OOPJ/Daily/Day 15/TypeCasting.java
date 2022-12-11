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
class TypeCasting
{
	public static void main(String args[])
	{
		First f = new First();
		Second s = new Second();
		Third t = new Third();
		
		f = s;
		//f.fun();
		//f = (First)t;	//error: incompatible types: Third cannot be converted to First
		
		s = f;			// error: incompatible types: First cannot be converted to Second
		s = (Second)f;
		s.fun();		//No Compile Time error but runtime error : java.lang.ClassCastException:First cannot be cast to Second
	}
}

