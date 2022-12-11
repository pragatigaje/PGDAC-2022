class WrapperDemo
{
        public static void main(String args[])
        { 
			
			Double I = new Double(135.23);
			System.out.println(I.byteValue());
			System.out.println(I.shortValue());
			System.out.println(I.intValue());
			System.out.println(I.longValue());
			System.out.println(I.floatValue());
			System.out.println(I.doubleValue());
			
		
			/*
			Integer i = new Integer(10);
			String s = i.toString();
			System.out.println(i);
			
			String str1 = Integer.toString(15,2);		//binary
			String str2 = Integer.toString(562,8);		//octal
			String str3 = Integer.toString(5462,16);		//Hexadecimal
			
			System.out.println(str1);
			System.out.println(str2);
			
			/*int i = Integer.parseInt("10");
			double d = Double.parseDouble("10.24654");
			boolean b = Boolean.parseBoolean("true");
			
			if(b)
			{
				System.out.println("I am true");
			}
			
			int bin = Integer.parseInt("1111",2);
			
			System.out.println(i);
			System.out.println(d);
			System.out.println(b);
			System.out.println(bin);
			*/
			
			/*
			System.out.println(Integer.toBinaryString(31));
			System.out.println(Integer.toOctalString(31));
			System.out.println(Integer.toHexString(31));
			*/
		}
}