package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class charCount 
{
	public static void main(String[] args) {
		
		String str = "Hello java Hello tops java";
		
		char words[] = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<words.length;i++)
		{
		     if(map.get(words[i])==null)
		     {
		    	 map.put(words[i], 1);
		     }
		     else
		     {
		    	 int c = map.get(words[i]);
		    	 c++;
		    	 map.put(words[i], c);
		     }
		}
		
		//System.out.println(map);
		
		for(Entry<Character, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		
	}
}
