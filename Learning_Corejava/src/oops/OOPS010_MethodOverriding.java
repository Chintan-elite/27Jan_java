package oops;
class X
{
	public void run()
	{
		System.out.println("runing run method...");
	}
}
class Y extends X
{
	@Override
	public void run() 
	{
		System.out.println("runing Y class run..");
	}
}

public class OOPS010_MethodOverriding
{
	public static void main(String[] args) {
		
		Y y = new Y();
		y.run();
		
		
	}
}
