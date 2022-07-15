package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 
{
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("php");
		al.add("android");
		al.add("ios");
		
		ArrayList<String> al1 = new ArrayList<String>(al);
		al1.add("Cricket");
		al1.add("Hockey");
		al1.add("Football");
		//al1.addAll(al);
		//al1.removeAll(al);
		
		Iterator<String> itr = al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
	}
}
