package oops;

class Pen
{
	//member can be static or not static
	//variable / fields
	int price = 10;
	static String color = "Blue";
	String company = "Cello";
	
	//method/function
	
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("running display...");
	}
	
}

public class OOPS01_MainClass
{
	 static public void main(String[] abc) {
		
		
		System.out.println("Program started...");
		
		Pen p = new Pen();
		p.toWrite();
		
		Pen p1 = new Pen();
		p1.toWrite();
		
		Pen.display();
		
	}
}
