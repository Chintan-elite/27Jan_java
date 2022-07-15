package oops;

class Calc1
{
	public void add(int a, int b)
	{
		int  r = a+b;
		System.out.println("m1 : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int  r = a+b+c;
		System.out.println("m2 : "+r);
	}
	
	public void add(int a, double b)
	{
		double  r = a+b;
		System.out.println("m3 : "+r);
	}
}

public class OOPS09_MEthodOverLoading
{
	public static void main(String[] args) {
		
		Calc1 c1 = new Calc1();
		c1.add(20, 30);
		c1.add(10, 20, 40);
		c1.add(20, 30.50);
		
	}
}
