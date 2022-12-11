import java.util.*;

class IterationDemo
{

	public static void main(String args[])
	{
		List <String> list1 = new ArrayList<String>();

		list1.add("Rohit");
		list1.add("Mukesh");
		list1.add("Radha");
		list1.add("Geeta");


		//Using for-each loop
		System.out.println("Using for-each iterating List1 elements: ");

		for(String s : list1)
		{
			System.out.println(s);
		}

		//Using Iterator
		System.out.println("Using Iterator iterating List1 elements: ");
		Iterator<String> it = list1.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}	

		//Using ListIterator
		System.out.println("Using ListIterator iterating List1 elements: ");
		ListIterator<String> lit = list1.listIterator();
		while(lit.hasNext())
		{
			String s = lit.next();
			System.out.println(s);
		}	

		System.out.println("Using ListIterator iterating List1 elements in reverse order: ");
		while(lit.hasPrevious())
		{
			String s = lit.previous();
			System.out.println(s);
		}

		//Using Enumeration 
		System.out.println("Using Enumeration iterating List1 elements: ");
		Enumeration<String> em = Collections.enumeration(list1);
		while(em.hasMoreElements())
		{
			String s = em.nextElement();
			System.out.println(s);
		}	
		


	}
}
