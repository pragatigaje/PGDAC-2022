class Student{

	int id ;
	String name;
	int marks;
	
	//Constructor:Default Constructor
                           
	
	/*Student()
	{
		id = 111; // Initialize default value
		name = "Pragati";
		marks = 88;
	}*/
	
	Student()
	{
		id = 111; // Initialize default value
		name = "Pragati";
		marks = 88;
	}
	
	Student(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;;
		this.marks =marks;
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;;
		this.marks =marks;
	}
	
	void display()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
	}

	public static void main(String args[]){
		
		System.out.println("Details:");
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student(012, "Pooja", 89);
		s2.display();
		Student s3 = new Student(225, "Pranjal");
		s3.display();
				
	}

}