package mypack2;

import mypack1.First;

public class Second 
{
	void display()
	{
		First f = new First();
		System.out.println(f.a);		//OK
		System.out.println(f.b);		//ERROR	
		System.out.println(f.c);		//ERROR
		System.out.println(f.d);		//ERROR
	}
}

