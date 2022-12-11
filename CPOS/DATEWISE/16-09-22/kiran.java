class Obj1{
	
//Instance variable 	
String name;
int id;
int age;

public static void main(String args[]){
	
	//Local variable
	int i=10;
	
	//Reference object created or object
	//Stack 
	Obj1 o1 = new Obj1();
	Obj1 o2 = new Obj1();
	
	
	//Assign value to instance variable
	o1.name = "Saurav";
	o1.id = 123;
	o1.age= 20;
	
	o2.name = "Diksha";
	o2.id = 234;
	o2.age= 19;
	
	System.out.println("Name="+o1.name);
	System.out.println("Name="+o1.id);
	System.out.println("Name="+o1.age);
	
	System.out.println("Name="+o2.name);
	System.out.println("Name="+o2.id);
	System.out.println("Name="+o2.age);
	
	
	 
	}
}