package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo
{
	public static void main(String[] args) {
		
		//initial = 16
		//load factor : 0.75
		//does not allow duplication
		//1 nul value allowed
		//store data in random manner
		HashSet<String> sh = new HashSet<String>();
		sh.add("Java");
		sh.add("Php");
		sh.add("Pythone");
		sh.add("Android");
		sh.add("Ios");
		sh.add("Java");
		
		Iterator<String> itr = sh.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
