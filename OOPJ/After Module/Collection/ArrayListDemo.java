import java.util.*;

public class ArrayListDemo extends ArrayList<Integer>
{
	public static void main(String args[])
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(30);
		list1.add(20);
		list1.add(40);
		list1.add(2,80);
		
		list2.add(66);
		list2.add(77);
		list2.add(88);
		list2.add(99);
		
		System.out.println(list1);
		System.out.println(list2);
		
		//list1.addAll(list2);
		list1.addAll(2,list2);
		System.out.println(list1);
		
		//System.out.println(list1.lastIndexOf(30));
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		list3.add(60);
		list3.add(70);
		System.out.println(list3);
		list3.removeRange(2,4);
		System.out.println(list3);
		
		
		
	}
    
}
