class Book{
	
	int id;
	String title;
	String author;
	int qty;
	int edition;
	int price;

	
	
	public static void main(String []args){
		
		Book b1 = new Book();
		Book b2 = new Book(); 
		b2 = b3;
		
		b1.id = 001;
		b1.title = "THE GUIDE";
		b1.author = "R.K. NARAYAN";
		b1.qty = 20;
		b1.edition = 01;
		b1.price = 2500;
		
		System.out.println("Id = "+b1.id);
		System.out.println("Title = "+b1.title);
		System.out.println("Author = "+b1.author);
		System.out.println("Quantity = "+b1.qty);
		System.out.println("Edition = "+b1.edition);
		System.out.println("Price = "+b1.price);
		
		
		
		
	}
	
	
}