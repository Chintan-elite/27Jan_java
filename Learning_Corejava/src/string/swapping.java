package string;

public class swapping {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swapping...");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
//		int temp =a;
//		a = b;
//		b = temp;
		
		a = a+b;
		b= a-b;
		a = a-b;
		
		System.out.println("after swapping...");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		
	}
}
