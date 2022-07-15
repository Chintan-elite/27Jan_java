package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARRaytocollection 
{
	public static void main(String[] args) {
		
		//int a[] = {10,20,30,40,50};
	//	List<int[]> al = Arrays.asList(a);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Php");
		
		String str[] = new String[al.size()];
		for(int i=0;i<str.length;i++)
		{
			str[i] = al.get(i);
		}
		
		
		for(String s : str)
		{
			System.out.println(s);
		}
		
		
	}
}
