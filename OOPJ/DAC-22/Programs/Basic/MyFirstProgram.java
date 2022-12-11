/** This program will print Hello World **/

public class MyFirstProgram
{
	/**
	*@author Shiv Nath Kumar
	*@param name takes name as input from the user
	*@param age takes the age as input
	*@return returns age 
	**/
	public static int myFun(String name, int age)
	{
		/*
		* Following if condition is mandatory as it checks for some special case ... more details
		*/
		if(age < 18)
		{
			//Some logic here
		}
		return age;
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello World!!");
	}
}
