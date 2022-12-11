interface MyInterface1
{
	void fun1();
}

interface MyInterface2
{
	void fun2();
}

interface MyInterface3 extends MyInterface2,MyInterface1
{
	void fun2();
}

class Demo implements MyInterface3
{
	// This class will have to implement three methods - fun1(),fun2(),fun3()
}