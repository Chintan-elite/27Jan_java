package thread;

class CalcOpration
{
	synchronized public void mul(int n)
	{
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{ 
			System.out.println(th.getName()+" : "+(i*n));
		}
	}
}

class Calc extends Thread
{
	CalcOpration c;
	
	public Calc(CalcOpration c) {
		super();
		this.c = c;
	}

	@Override
	public void run()
	{
		c.mul(5);
	}
}

public class MethodSync
{
	public static void main(String[] args) {
		
		CalcOpration c = new CalcOpration();
		Calc c1 = new Calc(c);
		Calc c2 = new Calc(c);
		
		c1.start();
		c2.start();
		
		
	}
}
