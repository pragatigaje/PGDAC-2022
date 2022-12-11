class ArrayBubbleSortOptimized
{
	void bubbleSort(int arr[])
	{
		boolean swapped;
		int n , temp, i,j;
		n = arr.length;
		for(i=0 ; i < n-1 ; i++)
		{
			swapped = false;
			for(j=0 ; j < n-i-1 ;j++) 
			{
				if(arr[j] < arr[j+1])
				{
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			// IF no two elements were
            // swapped by inner loop, then break
			print(arr);
			if(swapped==false)
				break;
		}
		System.out.println("Sorted array :");
		print(arr);
	}
	
	void print(int arr[])
	{
		System.out.print("Elements of array :");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		ArrayBubbleSortOptimized o1 = new ArrayBubbleSortOptimized();
		int arr[]= {8, 5, 6, 3, 2, 4};
		//o1.print(arr);
		o1.bubbleSort(arr);
		//o1.print(arr);
		
		
	}
}

