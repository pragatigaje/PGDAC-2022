class Combination
{
	static void display(String str, String res)
	{
		if (str.length()==0)	//Empty : base condition
		{
			System.out.println(res);
			return;
		}
		
		else
		{
			for (int i=0 ; i<str.length(); i++)
			{
				char r1 =str.charAt(i);
				String r2 = str.substring(0,i)+str.substring(i+1);
				display(r2, res+r1);	
			}
		}
	}
	
	public static void main(String args[])
	{
		String s = "ABC";
		display(s,"");
	}
}