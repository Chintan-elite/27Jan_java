package string;

class Demo
{
	int id = 10;
	String name = "tops";
	@Override
	public String toString() {
		
		return "Id : "+id+ "\n Name : "+name;
	}
}

public class ObjectDemo
{
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println(d);
		
	}
}
