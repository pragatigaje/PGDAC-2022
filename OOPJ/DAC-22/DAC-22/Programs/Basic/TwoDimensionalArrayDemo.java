class TwoDimensionalArrayDemo
{
	public static void main(String args[])
	{
		//int myarr[][];
		//myarr = new int[2][3];

		//int myarr[][] = new int[2][3];
		
		/*myarr[0][0] = 5;
		myarr[0][1] = 10;
		myarr[0][2] = 15;
		myarr[1][0] = 20;
		myarr[1][1] = 25;
		myarr[1][2] = 30;*/

		int myarr[][] = { 
					{5,10}, 
					{15,20,25,30} 
				};


		for (int i = 0 ; i < 2; i++)		//For row iteration
		{
			for (int j = 0; j < myarr[i].length; j++)	//For column iteration inside each row
			{
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println(myarr.length);
		System.out.println(myarr[0].length);
	}
}
