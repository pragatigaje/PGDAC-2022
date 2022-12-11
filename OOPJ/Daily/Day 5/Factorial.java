class Factorial{
	public static void main (String args[]){
	
	
	int num = Integer.parseInt((args[0]));
	int fact = 1;
	int i=num;
	
	while (i>0)
	{
		fact = fact*i;
		i--;
	}
	
	System.out.println("Factorial of "+num+" is "+fact);
	
	}

}