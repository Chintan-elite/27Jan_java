
class XYZ
{
	public String display()
	{
		//System.out.println("Running display...");
		return "Tops";
	}
	
	public void run()
	{
		System.out.println("run..");
	}
}

public class Demo
{
	public static void main(String[] args) {
		
		System.out.println("Hello");
		XYZ x = new XYZ();
		String s =  x.display();
		System.out.println(s);
		System.out.println(x.display());
		//String st = x.run();
	}
}
