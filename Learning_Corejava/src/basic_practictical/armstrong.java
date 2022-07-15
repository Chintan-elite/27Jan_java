package basic_practictical;

public class armstrong {
	public static void main(String[] args) {
		
		int num = 153;
		int sum = 0;
		int temp = num;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
		
		
		
	}
}
