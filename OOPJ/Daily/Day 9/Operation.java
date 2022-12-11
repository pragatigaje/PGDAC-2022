class Operation
{	
	int data = 50;
	
	void change (Operation op)
	{
		data += 500;
		System.out.println("After change in Fun = "+data);
	}
	
	public static void main(String args[])
	{
		Operation op = new Operation();
		System.out.println("Before change = "+op.data);
		op.change(op);
		System.out.println("After change = "+op.data);
	}
}