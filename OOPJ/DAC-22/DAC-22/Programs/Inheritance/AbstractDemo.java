abstract class Demo
{
	int a;
	int b;

	abstract void myFun();

	Demo(){
	}

	void anotherFun()
	{
		System.out.println("anotherFun of First");
	}
}

class First extends Demo
{
	int c;

	void myFun()
	{
		//code
	}

}

class AbstractDemo
{
	public static void main(String args[])
	{
		//new Demo(); //Compilation Error: Demo is abstract; cannot be instantiated
	}
}
