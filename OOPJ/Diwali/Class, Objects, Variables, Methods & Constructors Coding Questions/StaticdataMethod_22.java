//22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

public class StaticdataMethod_22 {

    static int a = 42;            //static var
    int b = 99;                     //non static var
	
	public static void  Method1(){
		System.out.println("static variable:" + a);                       
        System.out.println("non static variable:" + b);       //error: non-static variable b cannot be referenced from a static context
	}
    public static void main (String args[]) {
		Method1();
    }
}