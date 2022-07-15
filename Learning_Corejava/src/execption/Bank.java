package execption;

public class Bank
{
	public static void main(String[] args) {
		
		BankOpration b = new BankOpration();
		b.getBalance();
		b.deposite(5000);
		b.getBalance();
		b.deposite(7000);
		b.getBalance();
		try {
			b.widrow(2000);
		}catch(InsufficientFundException e)
		{
			e.printStackTrace();
			e.display();
		}
		
		b.getBalance();
		
		
	}
}
