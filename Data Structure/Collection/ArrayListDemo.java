import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList();
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(80);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		int d = list.get(2);
		System.out.println(d);
		
		
		
		//list.clear();
		//System.out.println(list);
		
	}
	
}