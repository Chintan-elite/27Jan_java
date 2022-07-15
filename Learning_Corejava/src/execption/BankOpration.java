package execption;

import java.io.IOException;

public class BankOpration
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	
	public void deposite(double amt)
	{
		balance=balance+amt;
		System.out.println(amt+" : credited !!");
	}
	
	public void widrow(double amt) throws InsufficientFundException
	{
		if(amt>balance)
		{
			//System.out.println("insuffcient fund!!!");
			double need = amt-balance;
			throw new InsufficientFundException(need);
		}
		else
		{
			balance=balance-amt;
			System.out.println(amt+" : Debited");
		}
	}
}
