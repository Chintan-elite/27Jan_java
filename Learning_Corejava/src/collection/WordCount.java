package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount 
{
	public static void main(String[] args) {
		
		String str = "Hello java Hello tops java";
		
		String words[] = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
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
		
		for(Entry<String, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		
	}
}
