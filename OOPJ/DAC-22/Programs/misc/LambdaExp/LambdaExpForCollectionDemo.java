import java.util.*;

class First 
{
	int a;
	int b;

	First()
	{
	}

	First(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public String toString()
	{
		return "First[a = " + a + ", b = " + b + "]";
	}

	//static void myFun(First f)
	 void myFun(First f)
	{
		System.out.println("myFun of First : " + f.a);
	}
}

class LambdaExpForCollectionDemo
{
	public static void main(String args[])
	{
		List<First> flist = new ArrayList<>();
		flist.add(new First(2,4));
		flist.add(new First(6,8));
		flist.add(new First(10,12));

		/*for(First f : flist)
		{
			System.out.println(f);
		}*/

		//forEach()
		flist.forEach(f -> {
			f.a = f.a+5; 
			f.b++;
		});
		//flist.forEach(f -> {System.out.println(f);});

		//flist.forEach(System.out::println);	//:: is known as Method reference operator

		//flist.forEach(First::myFun);		//First.myFun(First obj); For static method call
		flist.forEach(new First()::myFun);		//new First().myFun(First obj);
	}
}
