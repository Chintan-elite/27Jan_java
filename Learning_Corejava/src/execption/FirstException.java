package execption;

public class FirstException
{
	public static void main(String[] args) {
		
		
		System.out.println("Program started...");
		try
		{
			int i=10;
			int j=i/0;
			
			try {
				int a[] = new int[5];
				a[10] = 20;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		System.out.println("Program ended...");
		
	}
}
