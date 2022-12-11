import java.util.Scanner;
class Vowel{
	public static void main(String args []){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter an alphabet");
	char alphabet = sc.next().charAt(0);
	
	switch(alphabet){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Entered alphabet"+alphabet+" is Vowel");	
		break;
		default:
		System.out.println("Entered alphabet "+alphabet+" is not Vowel");	
	}
}
}