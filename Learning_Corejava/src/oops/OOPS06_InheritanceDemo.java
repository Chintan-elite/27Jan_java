package oops;

class A
{
	int i = 10;
	public void display()
	{
		System.out.println("runing class a display method...");
	}
}

class B extends A
{
	int i = 50;
	public void run()
	{
		int i = 70;
		System.out.println("i : "+i);
		System.out.println("i : "+this.i);
		System.out.println("i : "+super.i);
	}
	
	@Override
	public void display()
	{
		System.out.println("Runing class b display methd..");
		super.display();
	}
}
class C extends B
{
	
}


public class OOPS06_InheritanceDemo
{
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
		b.run();
	
		A a = new A();
		
	}
}
