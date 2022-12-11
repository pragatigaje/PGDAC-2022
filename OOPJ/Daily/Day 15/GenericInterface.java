interface MyInterface <T>
{
	void myFun(int a);
}

class Demo<T> implements MyInterface<T>
{
	void myFun(int a)
	{
		System.out.println(a);
	}
}




class GenericInterface