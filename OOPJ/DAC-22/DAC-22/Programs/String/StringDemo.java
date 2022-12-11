class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "welcome";
		String s2 = new String("welcome");
		String s3 = "welcome";
		String s4 = new String("welcome");

		//boolean b = (s1 == s2);
		//System.out.println(b);

		System.out.println("s1 == s2 returns " + (s1 == s2));	//false
		System.out.println("s1 == s3 returns " + (s1 == s3));	//true
		System.out.println("s3 == s4 returns " + (s3 == s4));	//false

		System.out.println("s1.equals(s2) returns " + s1.equals(s2));
		System.out.println("s1.equals(s3) returns " + s1.equals(s3));
		System.out.println("s3.equals(s4) returns " + s3.equals(s4));

		char ch = s1.charAt(3);

		System.out.println("s1.charAt(0) returns : "+s1.charAt(0));

		char chr[] = new char[10];

		s1.getChars(2,5,chr,2);

		for(int i = 0 ; i < chr.length; i++)
		{
			System.out.print(chr[i]);
		}
		System.out.println();

		System.out.println("\nOutput No ==> 1\n");

		byte [] b = s1.getBytes();

		for(byte x : b)
		{
			System.out.println(x);
		}

		System.out.println("\nOutput No ==> 2\n");
		String s5 = "WElcoMe";
		String s6 = "welComE";

		System.out.println("s5.equals(s6) returns : " + s5.equals(s6));		//false
		System.out.println("s5.equalsIgnoreCase(s6) returns : " + s5.equalsIgnoreCase(s6));//true

		System.out.println("\nOutput No ==> 3");
		char charr[] = s1.toCharArray();

		for(int i = 0; i < charr.length; i++)
		{
			System.out.println(charr[i]);
		}
		
		System.out.println("\nOutput No ==> 4");
		String s7 ="ABACDD";
		String s8 = "ABAACC";
		
		System.out.println("s7.compareTo(s8) returns : " + s7.compareTo(s8));
		
		String s9 = s1.substring(3);
		System.out.println("s1.substring(3) : "+s9);
		
		System.out.println("s1.indexOf(\"cme\") : "+ s1.indexOf("cme"));
		System.out.println("s1.contains(\"com\") : "+ s1.contains("com"));
		
		String s10 = "";
		System.out.println("s10.isEmpty() returns : "+s10.isEmpty());
		
		System.out.println(String.join("/","13","10","2022"));
		
		

	}
}

OUTPUT:

s1 == s2 returns false
s1 == s3 returns true
s3 == s4 returns false
s1.equals(s2) returns true
s1.equals(s3) returns true
s3.equals(s4) returns true
s1.charAt(0) returns : w
lco

Output No ==> 1

119
101
108
99
111
109
101

Output No ==> 2

s5.equals(s6) returns : false
s5.equalsIgnoreCase(s6) returns : true

Output No ==> 3
w
e
l
c
o
m
e

Output No ==> 4
s7.compareTo(s8) returns : 2
s1.substring(3) : come
s1.indexOf("cme") : -1
s1.contains("com") : true
s10.isEmpty() returns : true
13/10/2022
==============================================================================
