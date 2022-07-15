package basic_practictical;

public class Pettern5
{
	public static void main(String[] args)
	{
		int lines = 5;
		int starCount=1;
		for(int j=1;j<=lines;j++)
		{
			
			for(int i=1;i<=starCount;i++)
			{
				//(i+j)%2==0
				if((i%2)==(j%2))
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
			starCount++;
		}
		
		
		
		
		
		
		
		
	}
}
