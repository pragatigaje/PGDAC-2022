class First
{
	String name;
	
	First()
	{
	}
	
	First(String name)
	{
		this.name = name;
	}
	
	public void finalize()
	{
		System.out.println("finalize called for : "+name +"\n");
		//code
	}
}


class Demo
{
	static void myFun()
	{
		First f1 = new First("obj1");	//Local reference variable. Now obj1 is eligible for garbage 							//collection.
	}
}
	

class GarbageCollectionDemo
{
	public static void main(String args[])
	{
		Demo.myFun();
		
		First f2 = new First("obj2");
		f2 = null;			//Nullifying the reference variable. Now obj2 is eligible for 							//garabage collection.
		
		First f3 = new First("obj3");
		First f4 = new First("obj4");
		
		f3 = f4;			//Reassigning the reference variable. Now obj3 is eligible for 							//garbage collection
		
		new First("obj5");		//Anonymous object creation. This obj5 is eligible for garbage 							//collection.

		Runtime.getRuntime().gc();	//To explicitly request for garbage collection.
		//System.gc();
		
		//code
	}
}
