import mypack1.First;
import mypack1.Third;
import mypack2.Second;
import mypack2.Fourth;


public class AccessSpecifierDemo
{
	public static void main(String args[])
	{
		First f = new First();
		System.out.println(f.a);		//OK
		//System.out.println(f.b);		//Complation Error:  b has private access in First
		f.display();
		
		Fourth f = new Fourth();
		f.display();

		final int a = 5;
	}
}
