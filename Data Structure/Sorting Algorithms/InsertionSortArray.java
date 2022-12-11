class InsertionSortArray
{
	void insertsort(int[] arr)
	{
		int temp;
		int n = arr.length;
		for(int i=1; i < n; i++)
		{
			temp=arr[i];
			int j=i-1;
			
			while(j>-1 && temp < arr[j])
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void main(String args[])
	{
		InsertionSortArray list = new InsertionSortArray();
		int arr[]= {10, 15, 11, 9 , 47, 21};		
		list.insertsort(arr);
		System.out.println(toString(arr));
	}
}