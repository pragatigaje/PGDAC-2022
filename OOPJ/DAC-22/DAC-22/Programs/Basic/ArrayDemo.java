class ArrayDemo
{
	public static void main(String args[])
	{
		int marks[];
		marks = new int[5];

		//int marks[] = new int[5];
                marks[0] = 40;
                marks[1] = 65;
                /*marks[2] = 50;
                marks[3] = 75;
                marks[4] = 80;*/

		System.out.println("array length is : " + marks.length);

		for (int i = 0; i < marks.length; i++)
		{
			System.out.println(marks[i]);
		}

		System.out.println(marks[5]);

	}
}
