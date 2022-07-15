package basic;

public class UnaryDemo {
	public static void main(String[] args) {
		
		
		/*
		 * int a = 10; int b = ++a + --a - a-- + a++;
		 * 
		 * System.out.println("a : "+a); //10 10 System.out.println("b : "+b); //20 21
		 * 13
		 */		
		
		
		int a = 100;
		int b = 20;
		int c = 500;
		
		int r;
		
		//r = (a>b) ? a : b;
		r = (a>b) ? (a>c) ? a:c : (b>c) ? b:c;
		
		System.out.println(r);
		
		
		
	}
}
