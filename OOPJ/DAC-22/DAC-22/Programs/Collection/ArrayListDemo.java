import java.util.*;

class ArrayListDemo
{
	static void display(List<String> list)
	{
		for(String s : list)
		{
			System.out.println(s);
		}
	}

	public static void main(String args[])
	{
		List <String> list1 = new ArrayList<String>();

		list1.add("Rohit");
		list1.add("Mukesh");
		list1.add("Radha");
		list1.add("Geeta");


		//Using for-each loop
		System.out.println("List1 elements: ");
		display(list1);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Rohit");
		list2.add("Shyam");
		list2.add("Madhur");
		list2.add("Amisha");
		
		System.out.println("List2 elements: ");
		display(list2);

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Shyam");
		list3.add("Geeta");
		list3.add("Meeta");
		
		//addAll() method
		list1.addAll(list2);

		System.out.println("List1 elements after adding List2 elements:");
		display(list1);


		//clear() method

		//list1.clear();
	 	System.out.println("List1 elements after list1.clear():");
		display(list1);

		//contains() method

		boolean b;

		b = list1.contains("Shyam");
		System.out.println("list1.contains(\"Shyam\") : " + b);

		b = list1.contains("Rajan");
		System.out.println("list1.contains(\"Rajan\") : " + b);


		//containsAll() method
		b = list1.containsAll(list2);		//true
		System.out.println("list1.containsAll(list2) : " + b);

		b = list1.containsAll(list3);		//false
		System.out.println("list1.containsAll(list3) : " + b);

		//isEmpty() method
		b = list1.isEmpty();		//false
		System.out.println("list1.isEmpty() : " + b);

		//remove() method
		list1.remove("Mukesh");		//false
		System.out.println("List1 elements after removing Mukesh : ");
		display(list1);

		//removeAll() method
		//list1.removeAll(list2);
		System.out.println("List1 elements after removing all list2 : ");
		display(list1);

		System.out.println("List2 elements : ");
		display(list2);

		//retainAll() method
		list1.retainAll(list3);
		System.out.println("List1 elements after retaining all list3 : ");
		display(list1);

		System.out.println("List3 elements: ");
		display(list3);

		//size() method
		int r = list1.size();
		System.out.println("list1.size() : " + r);

		//toArray() method
		Object [] arr =  list1.toArray();
		System.out.println("Iterating arr after list1.toArray() : ");
		for(Object ob : arr)
		{
			System.out.println(ob);
		}


	}
}
