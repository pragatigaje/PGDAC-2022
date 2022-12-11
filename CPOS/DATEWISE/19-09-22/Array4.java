class Array4{

	public static void main (String args[]){
	
	int []a= {10,20,30,40,50};
	/*
	// for each loop
	for (int x:a)
	{
		System.out.println(x);
	}
	*/
	
	for (int i=0; i<=a.length; i++)
	{
		System.out.println("Index "+i+"= "+a[i]);
	}
	
		a[4]=100;
		System.out.println(a[4]);

	}
}