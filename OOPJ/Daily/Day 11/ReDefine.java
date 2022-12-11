class First
{
}

class Second extends First
{
}

class Third
{
}

class Demo
{
	First myFun()
	{
		First f = new First();
		return f;
	}
}

class Demo1 extends Demo
{
	Second myFun()		//As Second is child of First or we can say subtype of First
	{
		Second s = new Second();
		return s;
	}
	
}

if we redefine as 

Third myFun()		//It will give error as Third is not the child class of First.
{
}