package mypack1;

public class Third
{
	void display()
	{
		First f = new First();
		System.out.println(f.a);		//OK
		System.out.println(f.b);		//ERROR	
		System.out.println(f.c);		//OK
		System.out.println(f.d);		//OK
	}
}

