package oops;

interface I1 
{
	 int a = 10;
	 void display();
}

interface I2 extends I1
{
	//public void display();
	public void run();
}
class Abc
{
	
}

class Impl extends Abc implements I1,I2
{

	@Override
	public void display() {
		System.out.println("runing displa..");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class OOPS011_InterfaceDemo
{
	public static void main(String[] args) {
		
		Impl i = new Impl();
		i.display();
		
		
	}
}
