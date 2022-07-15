package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TessSetDemo
{
	public static void main(String[] args) {
		
		//store data in asd or desc order
		TreeSet sh = new TreeSet();
		sh.add("Java");
		sh.add("Php");
		sh.add("Pythone");
		sh.add("Android");
		sh.add("Ios");
		
		
		//Iterator<String> itr = sh.iterator();
		Iterator<String> itr = sh.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
