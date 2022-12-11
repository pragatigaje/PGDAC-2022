class ArrayInsertionSort
{
	void insertionSort(int arr[])
	{
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
			   
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
			
		System.out.println("Sorted array :");
		this.print(arr);
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
		ArrayInsertionSort o1 = new ArrayInsertionSort();
		int arr[]= {8, 5, 6, 3, 2, 4};
		//o1.print(arr);
		o1.insertionSort(arr);
	}
}

