class ShiftOperatorDemo
{
	public static void main(String args[])
	{
		char ch = '2';		//Ascii of A is 50 
		char b = (char)(ch << 1); //Ascii 100 => d
		System.out.println("b = '" +b + "'");
	}
}
