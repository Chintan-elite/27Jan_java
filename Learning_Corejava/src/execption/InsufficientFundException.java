package execption;

public class InsufficientFundException extends RuntimeException
{
	double amt;
	InsufficientFundException(double need)
	{
		amt = need;
	}
	
	public void display()
	{
		System.out.println("You need more : "+amt);
	}
}
