import java.util.Scanner;
public class StaticMethod{

	static int vol(int l)
	
	{
		return l*l*l;
	}
	
	

	public static void main(String args[]){
		
		// Scanner sc = new Scanner(System.in);

		//System.out.println(""); 
		//String s = sc.next();
		
		/* 
		StaticMethod p1 = new StaticMethod();
		
		int v= p1.vol(5);
		*/
		
		
		System.out.println("Volume of cube = "+vol(5));
		
		
	}
 

}