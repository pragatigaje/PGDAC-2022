class Geek{
	
	int i;
	
	
	Geek()
	{
		i =524551656;
		System.out.println("Constructor called");
	}
	
	
	void display()
	{
		System.out.println("I = "+i);
		System.out.println("Constructor called !!");
	}
	
	public static void main(String args[]){
		
		
		Geek g = new Geek();
		g.display();
		
	}
	
	
}