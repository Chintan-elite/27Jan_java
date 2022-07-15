package string;

public class StringMethod
{
	public static void main(String[] args) {
		
		String s = "Sun Rises in east";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('n'));
		System.out.println(s.charAt(5));
		System.out.println(s.replace('s', 'X'));
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,8));
		System.out.println(s.trim());
		
		System.out.println("******************");
		
		String sa[] = s.split(" ");
		for(int i=0;i<sa.length;i++)
		{
			System.out.println(sa[i]);
		}
		
		System.out.println("***********************");
		
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("***************************");
		
		byte b[] = s.getBytes();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
