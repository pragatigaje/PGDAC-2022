class Rec2 {
	
	int fact (int n)
	{
		if (n>=1)
			return n*fact(n-1);
		else
			return 1;
	}
	public static void main (String [] args){
	
		Rec2 f = new Rec2();
		int res = f.fact(5);
		System.out.println("Fcatorial = "+res);
	
	
	}

}