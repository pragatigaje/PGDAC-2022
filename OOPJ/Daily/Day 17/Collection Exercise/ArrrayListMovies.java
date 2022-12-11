import java.util.*;

class ArrrayListMovies implements Comparable <String>
{
	public int compareTo(String s)
	public static void main(String args[])
	{
		List <String> mlist = new ArrayList<>();
		
		mlist.add(0,"DJ");
		mlist.add("Son of Sathyamurthy");
		mlist.add("Pushpa");
		mlist.add("Time Story");
		mlist.add("A aa");
		
		System.out.println(mlist.get(0));
		mlist.set(2,"RRR");
		System.out.println(mlist.get(2));
		mlist.remove(3);
		System.out.println(mlist.get(3));
		System.out.println(mlist.indexOf("RRR"));
		
		System.out.println("---------------------------");
		
		Iterator <String> itr = mlist.iterator();
		while (itr.hasNext())
		{
			System.out.println();
			
		}
		
		
	}
}