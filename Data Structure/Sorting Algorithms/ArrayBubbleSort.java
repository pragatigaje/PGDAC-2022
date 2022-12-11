class ArrayBubbleSort
{
	void printArray(int[] arr)
	{
		System.out.print("Elements of array : ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	void bubbleSort(int[] arr)
	{
		int temp,n;
		n = arr.length;
		
		for(int i = 0; i < n-1 ; i++) // 0 1 2 3 
		{
			for(int j =0; j < n-i-1  ; j++) // 0 1 2 3 // 0 1 2
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		ArrayBubbleSort obj = new ArrayBubbleSort();
		int arr[]={12,94,65,48,87};
		obj.printArray(arr);
		obj.bubbleSort(arr);
		System.out.println("Sorted array : ");
		obj.printArray(arr);
		
		
		
	}
}