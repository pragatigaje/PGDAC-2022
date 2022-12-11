class JaggedArrayDemo
{
	public static void main(String args[])
	{
		int jarr[][];
		jarr = new int[2][];

		//int jarr[][] = new int[2][];
		
		jarr[0] = new int[2];
		jarr[1] = new int[4];

		jarr[0][0] = 5;
		jarr[0][1] = 10;
		jarr[1][0] = 15;
		jarr[1][1] = 20;
		jarr[1][2] = 25;
		jarr[1][3] = 30;

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < jarr[i].length; j++)
			{
				System.out.print(jarr[i][j]+"\t");

			}
			System.out.println();
		}
	}
}
