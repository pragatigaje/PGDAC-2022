class ArraySelectionSort
{
	void selectionSort(int arr[])
	{
		int i,j,temp,n, smallest;
		n=arr.length;
		
		for(i=0; i< n-1 ; i++)
		{
			smallest=i;
			for(j=i+1; j<n; j++)
			{
				if(arr[smallest] > arr[j])
				{
					smallest = j;
				}
			}
			temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			print(arr);
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
		ArraySelectionSort o1 = new ArraySelectionSort();
		int arr[]= {8, 5, 6, 3, 2, 4};
		//o1.print(arr);
		o1.selectionSort(arr);
	}
}