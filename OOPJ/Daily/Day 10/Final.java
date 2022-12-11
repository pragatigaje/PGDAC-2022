final class Info
{
	void mobileno()
	{
		System.out.println("8208258431");
	}
	
	void atmpin()
	{
		System.out.println("1819");
	}

	
}

class Thief extends Info
{
	void mobileno()
	{
		System.out.println("8208258431");
	}
	
	void atmpin()
	{
		System.out.println("1819");
	}

	
}

class Final
{
	public static void main(String args[])
	{
		Thief t = new Thief();
		t.mobileno();
		t.atmpin();
	}
}


/*
class Final
{
	public static void main(String args[])
	{
		final int a;
		a=10;
		// a++;
		System.out.println(a);

	}
}
*/