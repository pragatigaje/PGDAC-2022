import java.util.Scanner;
class Fibonacci{
	public static void main (String args []){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter series limit :");
	int count = sc.nextInt();
	
	long n1 = 0, n2 =1, i ;
	long n3=0;
	
	System.out.print(n1+"\n"+n2+"\n");
	count-=2;
	do
	{
		n3= n1+n2;
		System.out.println(n3);
		n1 = n2;
		n2 = n3;
		--count;
	}while(count>0);
	
	
	
	/*
	for (i=2; i<count ; ++i)
	{
		n3 = n1 + n2;
		System.out.println(n3);
		n1 = n2;
		n2 = n3;
	}
	*/
	}

}