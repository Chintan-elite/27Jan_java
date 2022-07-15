package basic;

public class Datatype
{
	public static void main(String[] args) {
		
		int i = 'A';
		System.out.println(i);
		
		char c = 70;
		System.out.println(c);
		
		//widning..
		//implicite
		int a = 20;
		long a1 = a;
		
		//nerrowing
		//explicite
		long b = 5892;
		int b1 = (int) b;
		
	}
}
