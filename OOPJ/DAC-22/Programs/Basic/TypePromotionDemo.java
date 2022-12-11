class TypePromotionDemo
{
	public static void main(String args[])
	{
		int a = 5;
		double d = 6.5;

		//double res = a * d;	     //no data loss, no typecasting needed
		//int res = (int)a * d;     //data loss, int * double => double * double => double
		//int res = (int) (a*d);
		int res = a * (int)d;

		System.out.println(res);

		byte b = 15;
		byte c = 5;

		byte res1 = b * c;


	}
}
