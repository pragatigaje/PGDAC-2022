class ArraySearchKiran
{
	static void display(int[] arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String args[])
	{
		int myarr[] = {10,20,30};
		System.out.println(myarr.length);
		int i=0;
		int arr[];
		arr = new int[8];
		int n = arr.length;
		
		arr[0]= 11;
		arr[1]= 15;
		arr[2]= 14;
		arr[3]= 19;
		arr[4]= 17;
		arr[5]= 52;
		
		//display function call
		display(arr);
		
		//search
		int key=17;
		for (i=0 ; i<arr.length; i++)
		{
			if (arr[i] == key)
				break;
		}
		if (arr[i] == key)
			System.out.println(" | Element "+key+" Found at "+i);
		else
			System.out.println("Element Not Found at ");
		
		System.out.println("-----------------------------------");
		
		
		//delete (search + delete)
		key=14;
		
		for (i=0 ; i<arr.length; i++)
		{
			if (arr[i] == key)
				break;
		}
		if (arr[i] == key)
			System.out.println("Element "+key+" Found at "+i);
		else
			System.out.println("Element Not Found at ");
		
		for (int k = i ; k < arr.length-1 ; k++)
		{
			arr[k]=arr[k+1];
		}
		
		for(i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
}