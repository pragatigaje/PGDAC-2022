class Exercise{

	public static void main (String args[]){
	
	for (int i= 1 ; i<=5; i++)
	{
		for (int j = 1;j<=5;j++)
		{
			System.out.println(i+","+j);
			if (j == i)
			{
				break;
			}
		}
		System.out.println("Inner");
		
	}
	System.out.print("Outer");
	
	
	/*
	int x = 10, y = 15;
	
	if (x++ > 10 && --y > 10)
	{
		
	}
	
	System.out.println(x);
	System.out.println(y);
	
	
	
	
	
	
	
	/*
	int x = 9, y = 12, z = 3;
	
	int exp1 = x - y/3 + z * 2 - 1;
	int exp2 = ( x - y)/3 + ((z * 2) - 1);
	System.out.println(exp1);
	System.out.println(exp2);
	
	
	/*
	double d1=(3.0*2/4);
	System.out.println(d1);
	*/
	}


}


