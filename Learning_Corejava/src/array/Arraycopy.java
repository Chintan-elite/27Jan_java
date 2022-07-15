package array;

public class Arraycopy
{
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,50,60,70};
		int b[] = new int[10];
		
		System.arraycopy(a, 2, b, 4, 3);
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		
	}
}
