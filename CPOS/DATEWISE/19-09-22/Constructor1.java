class Student{

	int id ;
	String name;
	int marks;
	
	//Constructor:Default Constructor
                           
	
	Student()
	{
		id = 111; // Initialize default value
		name = "Pragati";
		marks = 88;
	}
	
	void display()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
	}

	public static void main(String args[]){
		
		Student s1 = new Student();
		System.out.println("Details:");
		s1.display();		
	}

}