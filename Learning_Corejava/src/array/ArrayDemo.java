package array;

public class ArrayDemo
{
	public static void main(String abc[])
	{
//		int[] a =new int[10];
//		a[0] = 20;
//		a[5] = 30;
		//a[10] = 30;
		
		int a[] = {10,20,30,40,50,60};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		String sub[] = {"Java", "php","pythone"};
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
	}
}
