class Compare
{
	public static void main (String args[])
	{
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		Integer i3 = 100;
		
		System.out.println(i1==i2);		//false
		System.out.println(i1==i3);		//false
		System.out.println(i3==i2);		//true
		
		/*
		Integer i1 = new Integer(14);
		Integer i2 = new Integer(14);
	
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
				
		
		/*
		Integer i1 = 10;
		Integer i2 = 45;
		System.out.println(i1.equals(i2));	// true (10,10)	false(10,45)
		System.out.println(i1==i2);			//true (10,10)	false(10,45)
		*/
	}
}