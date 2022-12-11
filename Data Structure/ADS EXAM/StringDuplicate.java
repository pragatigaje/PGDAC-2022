import java.util.*;

class StringDuplicate
{
	static String removeDuplicate(String str)			//abcc
	{
		if(str.length() == 1)
			return str;
		else if(str.charAt(0) == str.charAt(1))
			return removeDuplicate(str.substring(1));
		else
			return str.charAt(0)+removeDuplicate(str.substring(1));
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
		String out = removeDuplicate(str);
		System.out.println("Output String  :");
		System.out.println(out);
		
	}
}