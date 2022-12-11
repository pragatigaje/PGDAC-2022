class First
{
	int num = 5;
}

class Second extends First
{
	int num = 10;	//in real life project we normally don't do that. we don't take data member with the 				//same name as it is in the parent class.
	void print()
	{
		System.out.println("Inside print");
		System.out.println(this.num);
		System.out.println(super.num);
	}
}


class MemberVariableBindingDemo
{
	public static void main(String args[])
	{
		First f = new Second();
		System.out.println(f.num);		//Prints 5, as member variable has always static binding
		((Second)f).print();
	}
}
