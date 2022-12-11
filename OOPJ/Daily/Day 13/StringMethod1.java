class StringMethod1
{
	public static void main (String args[])
	{
		String s = "Welcome";
		String s2 = "weLcOme";
		String s3 = "welcome";

	
		char ch = s.charAt(0);
		System.out.println("s.charAt(0) : "+ch);
		
		System.out.println("--------------------------");
		System.out.println("s.getBytes() : ");
		byte[] b = s.getBytes();
		for (int i : b)
		{
			System.out.println(i);
		}
			
		System.out.println("--------------------------");
		System.out.println("s2.equals(s) :"+s2.equals(s));
		System.out.println("s2.qualsIgnoreCase(s) :"+s2.equalsIgnoreCase(s));
			
		System.out.println("--------------------------");
		char charr[] = s.toCharArray();
		for (char x : charr)
		{
			System.out.println(x);
		}
		System.out.println("--------------------------");
		String s4 = "ABACDD";
		String s5 = "ABAADD";
		System.out.println("s4.compareTo(s5) :"+s4.compareTo(s5));
		
		System.out.println("--------------------------");
		
		String str = "welcome";
		String ss = "welcome".substring(2);
		System.out.println("ss = "+ss);
		System.out.println("welcome\".substring(3) returns :"+str.substring(3));
		System.out.println("welcome\".substring(3,5) returns :"+str.substring(3,5));
		
		System.out.println("--------------------------");
		String st = "Good Morning";
		String sn = st.replaceFirst("Morning","Night");
		System.out.println("st.replace\"Morning\",\"Night\" : "+sn);
		
		System.out.println("--------------------------");
		String date = new String("14/10/2022");
		String array1[]=str.split("/");
				
		for (String y : array1)
		{
			System.out.println(y);
		}
		
	
	}
	
}