package array;

public class SecondMAx {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,45,2,6,44,9,40,45};
		
		int max = a[0];
		int sec_max = a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sec_max = max;
				max = a[i];
			}
			else if(a[i]>sec_max && a[i]!=max)
			{
				sec_max = a[i];
			}
		}
		
		System.out.println("Max is : "+max);
		System.out.println("Second max : "+sec_max);
		
	}
}
