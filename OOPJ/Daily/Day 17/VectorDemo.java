import java.util.*;
class VectorDemo
{
	public static void display(List<String> list)
		{
			Iterator<String> it = list.iterator();
			while (it.hasNext())
			{
				String s = it.next();
				System.out.println(s);
			}
		}
		
	public static void main(String args[])
	{
				
		List<String> ar = new Vector<>();
		ar.add("Pragati");
		ar.add("Pooja");
		ar.add("Prachi");
		ar.add("Nikita");
		
		List<String> ar2 = new Vector<>();
		ar2.add("Vishnu");
		ar2.add("Harshank");
		display(ar);
		System.out.println("--------------------------------");
		display(ar2);
		System.out.println("--------------------------------");
		
		System.out.println("Elements at index 2 : "+ar.get(2));
		
		System.out.println("--------------------------------");
		ar.add(2,"Mansi");
		System.out.println("Elements at index 2 : "+ar.get(2));
		
		System.out.println("--------------------------------");
		ar.addAll(ar2);
		display(ar);
		
		System.out.println("--------------------------------");
		ar.addAll(2, ar2);
		display(ar);
		System.out.println("Elements at index 2 : "+ar.get(2));
		
		System.out.println("--------------------------------");
		System.out.println("indexof(\"Pragati\") : "+ar.indexOf("Pragati"));
		
		System.out.println("--------------------------------");
		System.out.println("Elements at index 2 : "+ar.get(2));
		ar.remove(2);
		System.out.println("Elements at index 2 after remove() : "+ar.get(2));
		
		System.out.println("--------------------------------");
		List <String> sb = ar.subList(2,5);
		display(sb);
		
		System.out.println("--------------------------------");
		
		
		
		
		
		
		
		
	}
}