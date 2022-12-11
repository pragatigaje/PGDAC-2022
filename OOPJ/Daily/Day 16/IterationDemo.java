import java.util.*;
class IterationDemo
{		
	public static void main(String args[])
	{
				
		List <String> list1 = new ArrayList<String>();
		list1.add("Pragati");
		list1.add("Pooja");
		list1.add("Prachi");
		list1.add("Nikita");
		
		System.out.println("Using for-each loop");
		for(String s : list1)
			{
				System.out.println(s);
			}
		System.out.println("--------------------");
		
		System.out.println("Using Iterator");
		Iterator<String> it = list1.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		System.out.println("Using List Iterator");
		ListIterator<String> lit = list1.listIterator();
		while(lit.hasNext())
		{
			String s = lit.next();
			System.out.println(s);
		}
		System.out.println("--------------------");
		
		System.out.println("Using List Iterator");
		Enumeration<String> em = Collections.enumeration(list1);
		while(em.hasMoreElements())
		{
			String s = em.nextElement();
			System.out.println(s);
		}
		
	}
}