import java.util.Scanner;
public class InstanceMethod{

	void sayHello( String s)
	{
		String str = s;
		System.out.println(s);
		System.out.println(str);
		System.out.println("Hello to CDAC !!!");
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to pass");
		String s = sc.next();
		
		InstanceMethod i1 = new InstanceMethod();
		i1.sayHello(s);
		
		//i1.sayHello("Good Morning !!!");
		
	}
 

}