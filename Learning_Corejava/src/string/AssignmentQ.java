package string;

public class AssignmentQ 
{
	public static void main(String[] args) {
		
		
		String s="sun rise in East";
		
		
		char ch[] = s.toLowerCase().toCharArray();
		int vowels = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' ||ch[i]=='u' )
			{
				vowels++;
			}
		}
				
		System.out.println("total vowels : "+vowels);
		
	}
}
