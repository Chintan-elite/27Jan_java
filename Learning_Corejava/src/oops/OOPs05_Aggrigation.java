package oops;

class Address
{
	String country="india";
	String  state = "Gujarat";
	String city = "surat";
	
	public void display()
	{
		System.out.println(country+" "+state+" "+city);
	}
}

class Employee
{
	int id=10;
	String name ="Payal";
	static Address adr = new Address();
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
	
}


public class OOPs05_Aggrigation
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		emp.display();
		
		Employee.adr.display();
		//System.out.println();
		
	}
}
