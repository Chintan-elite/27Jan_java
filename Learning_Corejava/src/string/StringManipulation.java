package string;

public class StringManipulation {
	public static void main(String[] args) {
		
		
		String s = "Sun rises in east";
		
		//east in rises sun
		//tsae ni sesir nus
		//east rises in sun
		//nus sesir ni tsae
		
		
		String sa[] = s.split(" ");
		
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(sa[i]+" ");
		}
		System.out.println();
		System.out.println("*****************");
		
		char ch[] = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("*****************");
		
		for(int i=0;i<sa.length;i++)
		{
			char c[] = sa[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print(" ");
		} 
		
		
		System.out.println();
		System.out.println("*****************");
		
		
		
		
		
		String temp = sa[0];
		sa[0] = sa[sa.length-1];
		sa[sa.length-1]  = temp;
		
		for(int i=0;i<sa.length;i++)
		{
			System.out.print(sa[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("*****************");
		
		
		
		
		
	}
}
