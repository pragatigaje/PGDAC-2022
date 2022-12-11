import java.util.*;

class RegularExpressionDemo
{
	public static void main(String args[])
	{
		String regex1 = "[4-7]{3}";
		String regex2 = "[4-7]{3,5}";
		String regex3 = "[4-7]{3,}";
		String regex4 = "(0|\\+91)[1-9][0-9]{9}";	//mobile no. validation
		String regex5 = "[abc]+";	
		String regex6 = "[a-zA-Z][a-zA-Z0-9_\\-\\.]*@(gmail|yahoo)\\.com";	
		String regex7 = "[\\d]{3}";
		String regex8 = "^ab[c-e]";
		String regex9 = "[c-e](a|b)$";

		String inptStr = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string to match the pattern : "+regex9);
		inptStr = sc.nextLine();

		boolean matched = inptStr.matches(regex9);
		System.out.println("Matched : " + matched);
		

	}
}
