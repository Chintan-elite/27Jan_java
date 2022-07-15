package oops;

class Calc
{
	public void display()
	{
		System.out.println("running display...");
	}
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Result is : "+c);
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public void arrayAdd(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum of array : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		
		int c= 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[c] = a[i];
			c++;
		}
		return b;
	}
	
	public void sum(int...a)
	{
		System.out.println("Var. args calling...");
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum of array : "+sum);
	}
	
	
}

public class OOPS04_MethodManipulation 
{
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.display();
		c.add(10, 20);
		c.add(30, 20);
		int sq = c.square(5);
		System.out.println("square is :"+sq);
		System.out.println("square is of 6 is  :"+c.square(6));
		
		int a[] = {10,20,30,40,50};
		c.arrayAdd(a);
		System.out.println("**********************");
		
		int b[] = c.revArray(a);
		
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		
		c.sum(10,20,30,40,50,60,20);
	}
}
