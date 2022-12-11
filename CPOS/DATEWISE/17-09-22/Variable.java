class Variable{
	
	String username;
	int posts;
	
	
	static String app = "Whatsapp";
	static long whatsapp_no;
	
	public static void main(String [] args){
		
		Variable insta = new Variable();
		insta.username = "pragatigaje";
		insta.posts = 12;
		
		Variable.whatsapp_no = 8431;
		
		int x = 10;
		
		System.out.println("x ="+x);
		
		System.out.println("Instagram :");
		System.out.println("Instagram username:"+insta.username);
		System.out.println("Instagram posts:"+insta.posts);


		System.out.println("Application :"+Variable.app);
		System.out.println("Whatsapp No :"+Variable.whatsapp_no);
	}
		
	// System.out.println("Instagram username:"+insta.username);
	//	System.out.println("Whatsapp No :"+Variable.whatsapp_no);
}
