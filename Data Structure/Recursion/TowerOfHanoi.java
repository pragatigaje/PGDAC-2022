class TowerOfHanoi
{
	static void toh(int n,char a, char inter, char c)
	{
		if(n==1)
			System.out.println(a+" to "+c);
		else
		{
			toh(n-1,a,c,inter);
			System.out.println(a+" to "+c);
			toh(n-1,inter,a,c);
			System.out.println();

		}
	}
	public static void main(String args[])
	{
		
		int n=4;
		toh(n,'A','B','C');
	}
}