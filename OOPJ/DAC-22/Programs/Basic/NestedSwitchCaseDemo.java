class NestedSwitchCaseDemo
{
	public static void main(String args[])
	{
		int choice = 1;

		outer: switch (choice)
		{
			case 1:
				System.out.println("Choice 1 selected");

				char ch = 'y';
				/*switch (ch)
				{
					case 'x':
						System.out.println("Inner switch: case x");
						break;
					case 'y':
						System.out.println("Inner switch: case y");
						break outer;
					default:
						System.out.println("Inner switch: default");
						break;
				}*/
				System.out.println("Out of inner switch");
				break;	
			case 2:
				char ch;
				ch = 'x';
				System.out.println("ch = "+ch);
				System.out.println("Choice 2 selected");
				break;

			case 3:
				System.out.println("Choice 3 selected");
				break;
			default:
				System.out.println("default choice");
		}

		System.out.println("Out of outer switch-case");
	}
}
