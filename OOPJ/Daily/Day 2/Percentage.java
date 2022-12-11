import java.util.*;
class Percentage{

	public static void main (String args []){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter No of Subjects : ");
	int n = sc.nextInt();
	System.out.println("Enter Total Marks that can be obtained in each subject: ");
	int out = sc.nextInt();
	int outof = n*out;
	
	int arr[]=new int[n];
	double sum=0;
	
	System.out.println("Enter your marks: ");
	for (int i=0; i<arr.length; i++)
	{
		arr[i]= sc.nextInt();
	}
	
	for (int i=0; i<arr.length; i++)
	{
		sum+=arr[i];
	}
	
	double avg = sum/n;
	double per = (sum/outof)*100;
	
	System.out.println("Average = "+avg+" ");
	System.out.println("Percentage = "+per+" %");
	
	
	}

}