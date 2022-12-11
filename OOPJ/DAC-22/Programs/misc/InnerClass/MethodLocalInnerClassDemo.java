class MethodLocalInnerClassDemo
{
	public static void myFun()
	{
		System.out.println("myFun of MethodLocalInnerClassDemo");
		
		//Method inner class
		//Its object will always be created inside this method only.
		class MyClass
		{
			int add(int a, int b)
			{
				return a+b;
			}

		}

		MyClass myObj1 = new MyClass();
		int res = myObj1.add(5,10);
		System.out.println("Sum is : " + res);

	}

	public static void main(String args[])
	{
		myFun();
	}
}
