class Array2{

	public static void main (String args[]){
	
	int []a= {10,20,30,40,50};

	for (int i=0; i<=4; i++)
	{
		System.out.println("Index "+i+"= "+a[i]);
	}
	
		a[4]=100;
		System.out.println(a[4]);
	}
}