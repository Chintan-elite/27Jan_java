package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo
{
	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(50);
		v.addElement(80);
		
		
		Enumeration em = v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
		
	}
}
