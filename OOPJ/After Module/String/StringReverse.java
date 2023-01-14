class StringReverse{
	
	static void reverse1(String str){
		char[] carray = str.toCharArray();
				
		for(int i=carray.length-1 ; i >= 0 ; i--){
			System.out.print(carray[i]);
		}
	}
	
	static void reverse2(String str){
		String rstr="";
		for(int i=0; i < str.length() ; i++){
			char ch = str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println(rstr);
	}
	
	public static void main(String args[]){
	
		StringBuilder str = new StringBuilder("pragati");
		//reverse2(str);
		
		StringBuilder s = str.reverse();
		System.out.println(s);
	
	}
}