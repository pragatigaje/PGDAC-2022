import java.lang.reflect.*;

class First
{
}

class Second
{
}

class MyClass extends First
{
	public int a;
	private int b;
	static int c;

	public MyClass()
	{
		System.out.println("No argument constructor invoked");
	}
	
	public MyClass(int x)
	{
		System.out.println("One argument constructor invoked");
	}

	public MyClass(int x, int y)
	{
		System.out.println("Two arguments constructor invoked");
	}

	public void myFun(int a, double b)
	{
		System.out.println("fun1 invoked");
	}
	
	public void myFun2()
	{
		System.out.println("myfun2 invoked");
	}

	private void myFun3()
	{
		System.out.println("myfun3 invoked");
	}

	private static void myFun4(int x, double y)
	{
		System.out.println("myfun4 invoked : "+ (x+y));
	}
}

class ReflectionDemo
{
	public static void main(String args[]) throws Exception
	{
		MyClass myObj = new MyClass(5,10);
		
		//Class classObj = myObj.getClass();
		//Class classObj = MyClass.class;
		Class classObj = Class.forName("MyClass");

		Method[] methods = classObj.getMethods();
		Field[] fields = classObj.getFields();

		for(Method m : methods)
		{
			System.out.println(m.getName());
		}
		
		for(Field f : fields)
		{
			System.out.println(f.getName());
		}
		
		Constructor constructor = classObj.getConstructor(int.class);
		System.out.println(constructor.getName());
		
		Method method1 = classObj.getDeclaredMethod("myFun3");
		method1.setAccessible(true);
		method1.invoke(myObj);
		
		Method method2 = classObj.getDeclaredMethod("myFun4",int.class,double.class);
		method2.setAccessible(true);
		method2.invoke(classObj,5,10.0);
		
		//instanceof
		
		//boolean b = myObj instanceof MyClass;	//true
		boolean b = myObj instanceof First;	//true
		
		System.out.println(b);
		
		System.out.println("myObj is the object of class : " + myObj.getClass().getName());

	} 
}
