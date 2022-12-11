class Rec {
	
	int sum(int b)
	{
		if (b>0)
		return b+sum(b-1);
		else 
			return 0;
	}
	public static void main (String [] args){
	
	Rec s = new Rec();
	int i = s.sum(10);
	System.out.println("Sum = "+i);
	
	}

}