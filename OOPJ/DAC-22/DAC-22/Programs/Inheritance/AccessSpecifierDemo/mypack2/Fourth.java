package mypack2;

import mypack1.First;

public class Fourth extends First
{	
	void display()
	{
		System.out.println(a);		//OK
		System.out.println(b);		//ERROR	
		System.out.println(c);		//ERROR
		System.out.println(d);		//OK
	}
}
