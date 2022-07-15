package oops;

 abstract class Account
{
	double balance;
	 public abstract void addInterest();
	public abstract void deposute(double amount);
	public void getBalance()
	{
		System.out.println("Current balance is..."+balance);
	}
	
	
}

class SavingAccount extends Account
{
	
	@Override
	public void addInterest()
	{
		System.out.println("cureent interst rate is 10%");
	}

	@Override
	public void deposute(double amount) {
		balance = balance+amount;
	}
	
	
}

class CurrentAccount extends Account
{

	@Override
	public void addInterest() {
		System.out.println("Intrest rate is 0%");
		
	}

	@Override
	public void deposute(double amount) {
		balance = balance+amount;
		
	}
	
}

public class OOPS011_abstractdemo 
{
	public static void main(String[] args) {
		
		Account a = new SavingAccount();
		Account b = new CurrentAccount();
		a.addInterest();
		a.deposute(2000);
		a.getBalance();
		b.addInterest();
		b.deposute(5000);
		b.getBalance();
		
	
		
		
		
	}
}
