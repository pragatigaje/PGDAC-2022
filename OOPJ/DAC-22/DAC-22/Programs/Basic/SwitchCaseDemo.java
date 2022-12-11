class SwitchCaseDemo
{
	public static void main(String args[])
	{
		int choice = 5;

		switch (choice)
		{
			default:
				System.out.println("default choice");
			case 1:
				System.out.println("Choice 1 selected");
				break;
			case 2:
				System.out.println("Choice 2 selected");

			case 3:
				System.out.println("Choice 3 selected");
				break;
		}

		System.out.println("Out of switch-case");
	}
}
