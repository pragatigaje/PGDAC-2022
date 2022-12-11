class SumOfSeries
{
	static float sumRec(int i, int n, float sum)
	{
		if(i>n)
			return sum;
		else 
		{
			if(i%2 == 0)
				sum -= (float)1/i;
			else
				sum += (float)1/i;
		}
		return sumRec(i+1, n,sum);
	}
	
	
	/*
	static void sum(float n)
	{
		float sum=0;
		for(float i=1; i<=n; i++)	// 1 2 3 4 5 
		{
			if(i%2 == 0)
			{
				sum= sum-(1/i);
			}
			else
			{
				sum=sum+(1/i);
			}
		}
		System.out.println(sum);
	}
	*/
	public static void main(String args[])
	{
		int n=3;
		int i=1;
		float sum=sumRec(1,n,0);
		//sum(n);
		System.out.print(sum);
		
	}
}