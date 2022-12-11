import java.util.*;
import java.util.regex.*;

class PatternDemo
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
		String regex10 = "[abcABC]{3}";
		String regex11 = "abc\\b";

		String inptStr = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string to match the pattern : "+regex11);
		inptStr = sc.nextLine();

		Pattern pattern = Pattern.compile(regex11);
		Matcher matcher = pattern.matcher(inptStr);
		while(matcher.find())
		{
			System.out.println("matched from " + matcher.start() + " to " + matcher.end());

		}
		boolean exactMatched = matcher.matches();
		System.out.println("Exact matched : " + exactMatched );
		

	}
}
