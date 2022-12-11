import java.util.Scanner;
class StringDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.nextLine();
		String tgl = "";
		for (int i=0; i < str.length() ; i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				tgl = tgl+Character.toLowerCase(str.charAt(i));
			else
				tgl = tgl+Character.toUpperCase(str.charAt(i));
		}
		System.out.println("Input : "+str);
		System.out.println("Output : "+tgl);
	}
}