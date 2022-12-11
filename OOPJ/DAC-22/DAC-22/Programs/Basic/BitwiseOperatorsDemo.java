class BitwiseOperatorsDemo
{
	public static void main(String args[])
	{
		//Bitwise operators => ~ (NOT) , & (AND), | (OR) , ^ (XOR)

		int a = 10;
		int b = 18;

		int res;

		res = ~a;
		System.out.println("~a => " + res);

		res = a & b;
		System.out.println("a & b => " + res);
	}
}
