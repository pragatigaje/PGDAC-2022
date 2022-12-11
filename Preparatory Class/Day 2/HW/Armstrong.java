import java.util.Scanner;

class Armstrong{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number :");
int i= sc.nextInt();
int num=i;
int n1,n2,n3,n4,sum;

n1= num%10;   //n1=4
num= num/10;  //num=163
n2= num%10;   //n2=3
num= num/10;  //num=16
n3= num%10;   //n3=6
num= num/10;  //num=1
n4= num;
sum=(n1*n1*n1*n1)+(n2*n2*n2*n2)+(n3*n3*n3*n3)+(n4*n4*n4*n4);

	if (sum==i)
		System.out.println("This is a Armstrong Number");
	else
		System.out.println("This is not an Armstrong Number");

}
}