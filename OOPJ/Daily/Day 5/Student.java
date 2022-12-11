import java.util.Scanner;
class Student{
	int roll;
	String name;
	double marks;
	Scanner sc = new Scanner(System.in);
	
	void printDetails()
	{
		System.out.println("Roll No :"+roll);
		System.out.println("Name of Student :"+name);
		System.out.println("Marks out of 500 :"+marks);
	}
	
	void addDetails()
	{
		System.out.println ("Add details---");
		System.out.println ("Enter Roll No :");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.println ("Enter Name :");
		name = sc.nextLine();
		System.out.println ("Enter Marks :");
		marks = sc.nextDouble();
	}
	
	void changeMarks()
	{
		marks= sc.nextInt();
	}
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;
	Student s1 = new Student();
	s1.roll = 001;
	s1.name = "Pragati Gaje";
	s1.marks = 440;
	
	Student s2 = new Student();
	Student s3 = new Student();
	System.out.println("Enter choice to call method :");
	System.out.println("1.addDetails\n 2.changeMarks 3.printDetails");
	choice = sc.nextInt();
	switch (choice)
	{
		case 1 :
			s1.addDetails();
			break;
		case 2 :
			s1.changeMarks();
			break;
		case 3 :
			s3.printDetails();
		default :
			System.out.println("Invalid Method");
	}
	
	}

}