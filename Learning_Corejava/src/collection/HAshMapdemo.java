package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HAshMapdemo
{
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Java");
		map.put(20, "Php");
		map.put(30, "Android");
		map.put(10, "ios");
		
		//System.out.println(map);
		//System.out.println(map.get(10));
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
