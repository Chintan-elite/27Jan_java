package basic_practictical;

public class PrimeCheck {
	public static void main(String[] args) {
		
		
		for(int num=3;num<=100;num++)
		{
			
		int flag = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println(num+" is Prime no");
		}
		else
		{
			System.out.println(num+" is Not Prime");
		}
		
	}
		
	}
}
