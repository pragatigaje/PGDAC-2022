class StringBufferDemo
{
	public static void main(String args[])
	{
		//StringBuffer s1 = "Welcome";
		StringBuffer s1 = new StringBuffer("Welcome");
		System.out.println(s1);
		s1.append(" Friends");
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer();			//s2 capacity 16
		System.out.println("s2 capacity: "+s2.capacity());
		
		StringBuffer s3 = new StringBuffer("12345");		//s3 capacity 21
		System.out.println("s3 capacity: "+s3.capacity());
		
		s2.append("1234");					//still s2 capacity 16	
		System.out.println("s2 capacity: "+s2.capacity());
		
		s2.append("123456789012");				//still s2 capacity 16 but full
		System.out.println("s2 capacity: "+s2.capacity());
		
		s2.append("1");						//new capacity = 16 * 2 + 2 = 34
		System.out.println("s2 capacity: "+s2.capacity());
		
	}
}
