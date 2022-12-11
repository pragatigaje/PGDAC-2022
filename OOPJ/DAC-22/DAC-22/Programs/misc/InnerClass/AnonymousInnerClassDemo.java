interface MyInterface
{
	void myFun1();
	void myFun2();
}

class MyClass
{
	void fun1()
	{
		System.out.println("fun1 of MyClass");
	}
}

class AnonymousInnerClassDemo
{
	public static void main(String args[])
	{
		//MyInterface mif1 = new MyInterface(){};
		//Here an anonymous inner class is supposed to implement the 								//MyInterface methods and also returns anonymous class object.

		MyInterface mif1 = new MyInterface(){
			public void myFun1()
			{
				System.out.println("myFun1 of anonymous inner class");
			}	

			public void myFun2()
			{
				System.out.println("myFun2 of anonymous inner class");
			}
		};

		mif1.myFun1();
		mif1.myFun2();

		MyClass mycls1 = new MyClass(){
			void fun1()
			{
				System.out.println("fun1");
			}
		};

		mycls1.fun1();
	}
}
