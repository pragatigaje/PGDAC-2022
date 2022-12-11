//17. Java Program to Illustrate Use of Constructor

class Student{
	int rollNo;
	int age;
	double marks;

	Student(){
		System.out.println("Zero-arg constructor called");
	}

	Student(int r){
		System.out.println("One-arg constructor called");
		rollNo = r;
	}

	Student(int r,int a, double m){
		System.out.println("Three-arg constructor called");
		rollNo = r;
		age = a;
		marks = m;
	}

	void setDetails(int r, int a, double m){
		rollNo = r;
		age = a;
		marks = m;
	}

	void printDetails(){
		System.out.println(rollNo+","+age+","+marks);
	}
}

public class useOfConstructor_17{
	public static void main(String args[])
	{
		Student stud1 = new Student( );
		Student stud2 = new Student(2 );
		Student stud3 = new Student(1,20,75.0);
		stud3.printDetails();
		stud3.setDetails(3,22,72.5);
		stud3.printDetails();
	}
}