final class First
class First
{
	final int num;
	
	First()
	{
		num=10;
	}
	
	final void print()
	{
		System.out.println("print of First");
	}
}

class Second extends First
{
	void print()
	{
		System.out.println("print of Second");
	}
}
class FinalDemo
{
	public static void main(String args[])
	{
		
		final int a = 10;
		System.out.println("a = "+a);
		// a++;
		First f = new First();
		//f.num++;
		System.out.println("num = "+f.num);
		
		Second s =new Second();
		s.print();
	}
}