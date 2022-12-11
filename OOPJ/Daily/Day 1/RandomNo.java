import java.util.Random;

class RandomNo{

	public static void main(String args[]){
	
	Random o1 = new Random();
	//Scanner sc = new Scanner(System.in);
	
	int max = 10000;
	int min = 99999;
	
	double a = Math.random()*(max-min+1)+min;
	int b = (int) (Math.random()*(max-min+1)+min);
	
	int x= o1.nextInt();
	int y= o1.nextInt(100);

	System.out.println("1st Random Number :"+Math.random());
	System.out.println("2nd Random Number :"+Math.random());
	
	System.out.println("Otp generated : "+a);
	System.out.println("Otp generated : "+b);
	
	System.out.println(" X : "+x);
	System.out.println(" Y : "+y);
	
	
	
	}


}