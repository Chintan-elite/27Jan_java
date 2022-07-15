package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) {
		
		//initial size : 10
		//new size = oldsize*3/2 + 1
		//preserve insertion order
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add("Tops");
		al.add('A');
		al.add(45.23);
		al.add(25);
		al.add(56.36);
		al.add(89);
		al.add("abc");
		al.add(56);
		al.add(56);
		al.add(null);
		
		
		//System.out.println("size  : "+al.size());
		//System.out.println(al.get(8));
		//al.remove(1);
		//al.add(1,200);
		//al.set(1, 200);
		
//		for(Object o : al)
//		{
//			System.out.println(o);
//		}
		
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
