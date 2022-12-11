class Geeks{
	
	int id;
	String name;
	
	Geeks ()
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
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
	}
	
	
	
	public static void main(String args[]){
		
		
		Geeks g1 = new Geeks();
		g1.display();
		Geeks g2 = new Geeks(12, "Pragati");
		g2.display();
	}
	
}