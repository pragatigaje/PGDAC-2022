class Geeks{
	
	int id;
	String name;
	
	Geeks (int id , String name)
	{
		id =51;
		name= "rahul";
	}
	
	Geeks (int id , String name)
	{
		this.id =id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Id = "+i);
		System.out.println("Name = "+name);
	}
	
	
	
	public static void main(String args[]){
		
		
		Geeks g1 = new Geeks();
		g.display();
		Geeks g2 = new Geeks(12, "Pragati");
		g.display();
	}
	
}