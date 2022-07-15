package oops;

class P
{
	P()
	{
		System.out.println("runing P class cons...");
	}
}

class Q extends P
{
	Q()
	{
		super();
		System.out.println("running Q class cos...");
	}
	
	Q (int id)
	{
		this();
		System.out.println("id : "+id);
	}
	
	Q(String name)
	{
		this(10);
		System.out.println("Name : "+name);
	}
}

class R extends Q
{
	R()
	{
		super("Tops");
		System.out.println("runing R class cons..");
	}
}

public class OOPs007_constructorchainig 
{
	public static void main(String[] args) 
	{
		R r = new R();
		
	}
}
